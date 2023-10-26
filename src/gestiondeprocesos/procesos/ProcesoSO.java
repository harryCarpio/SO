package gestiondeprocesos.procesos;

import java.io.*;

/**
 * Crea un proceso externo haciendo uso el API de Java
 */
public class ProcesoSO {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println("Uso: java ProcesoSO <command>");
            System.exit(0);
        }

        // args[0] is the command that is run in a separate process
        ProcessBuilder pb = new ProcessBuilder(args[0]);
        Process process = pb.start();

        // obtain the input stream
        InputStream is = process.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        // read the output of the process
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
