package client;

import java.io.*;
import java.net.Socket;

public class CrosswordClient {
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;

    public CrosswordClient(String serverAddress, int port) throws IOException {
        socket = new Socket(serverAddress, port);
        out = new PrintWriter(socket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }

    public void sendMessage(String message) {
        out.println(message);
    }

    public String receiveMessage() throws IOException {
        return in.readLine();
    }

    public void closeConnection() throws IOException {
        in.close();
        out.close();
        socket.close();
    }

    public static void main(String[] args) {
        try {
            CrosswordClient client = new CrosswordClient("localhost", 12345);
            // Example of sending and receiving messages
            client.sendMessage("Hello Server!");
            String response = client.receiveMessage();
            System.out.println("Server response: " + response);
            client.closeConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}