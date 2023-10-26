package gestiondeprocesos.procesos.comunicacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class FechaCliente {
    public static void main(String[] args) {
        try {
            // Conexión al servidor
            Socket sock = new Socket("127.0.0.1", 6013);
            InputStream in = sock.getInputStream();
            BufferedReader bin = new BufferedReader(new InputStreamReader(in));

            // Lee la fecha del socket
            String line;
            while ((line = bin.readLine()) != null)
                System.out.println(line);

            // Cierra la conexión por socket
            sock.close();
        } catch (IOException ioe) {
            System.err.println(ioe);
        }
    }
}
