package gestiondeprocesos.procesos.comunicacion;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class FechaServidor {
    public static void main(String[] args) {
        try {
            ServerSocket sock = new ServerSocket(6013);
            // Inicia escucha por conexiones / requerimientos (request)
            while (true) {
                Socket client = sock.accept();
                PrintWriter pout = new PrintWriter(client.getOutputStream(), true);

                // Escribe la fecha en el socket
                pout.println(new java.util.Date().toString());

                // Cierre el socket y continúa esperando por conexiones
                client.close();
            }
        } catch (IOException ioe) {
            System.err.println(ioe);
        }
    }
}
