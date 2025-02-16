import java.io.*;
import java.net.*;

public class CrucigramaServidor {
    private static final int PUERTO = 12346;  // Cambia a otro puerto


    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PUERTO)) {
            System.out.println("Esperando jugador...");

            // Aceptar la conexión de un cliente (jugador 2)
            try (Socket clienteSocket = serverSocket.accept();
                 BufferedReader entrada = new BufferedReader(new InputStreamReader(clienteSocket.getInputStream()));
                 PrintWriter salida = new PrintWriter(clienteSocket.getOutputStream(), true)) {

                System.out.println("Jugador 2 conectado.");

                // Leer la jugada del cliente
                String jugada = entrada.readLine();
                System.out.println("Jugada de jugador 2: " + jugada);

                // Responder al cliente
                salida.println("Jugada recibida por servidor: " + jugada);

                // Aquí podrías agregar más lógica de interacción (verificación de la jugada, actualizaciones de tablero, etc.)
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
