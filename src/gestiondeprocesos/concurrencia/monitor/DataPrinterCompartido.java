package gestiondeprocesos.concurrencia.monitor;

// Clase que implementa el concepto de Monitor
public class DataPrinterCompartido {
    synchronized public void display(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            try {
                Thread.sleep(150);
            }
            catch (Exception e) {
            }
        }
    }
}
