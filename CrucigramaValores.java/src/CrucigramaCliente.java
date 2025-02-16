import java.io.*;
import java.net.*;

public class CrucigramaCliente {
    private static final String HOST = "localhost";  // Dirección del servidor
    private static final int PUERTO = 12346;  // Asegúrate de que el cliente use el mismo puerto

    public static void main(String[] args) {
        try (Socket socket = new Socket(HOST, PUERTO);
             BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader consola = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Conectado al servidor.");
            System.out.print("Introduce tu jugada: ");
            String jugada = consola.readLine();  // El cliente introduce su jugada

            // Enviar la jugada al servidor
            salida.println(jugada);

            // Recibir la respuesta del servidor
            String respuesta = entrada.readLine();
            System.out.println("Respuesta del servidor: " + respuesta);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
