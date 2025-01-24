package network;

import java.io.*;
import java.net.*;

public class NetworkManager {
    private Socket socket;
    private ObjectOutputStream outputStream;
    private ObjectInputStream inputStream;

    public NetworkManager(String serverAddress, int port) throws IOException {
        socket = new Socket(serverAddress, port);
        outputStream = new ObjectOutputStream(socket.getOutputStream());
        inputStream = new ObjectInputStream(socket.getInputStream());
    }

    public void sendMessage(Message message) throws IOException {
        outputStream.writeObject(message);
        outputStream.flush();
    }

    public Message receiveMessage() throws IOException, ClassNotFoundException {
        return (Message) inputStream.readObject();
    }

    public void closeConnection() throws IOException {
        inputStream.close();
        outputStream.close();
        socket.close();
    }
}