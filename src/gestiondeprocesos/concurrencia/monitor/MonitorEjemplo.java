package gestiondeprocesos.concurrencia.monitor;

public class MonitorEjemplo {
    public static void main(String[] args) {

        // Instancia de recurso compartido que imprime un caracter a la vez
        DataPrinterCompartido printer = new DataPrinterCompartido();

        // Instancias de hilos que comparten impresora de datos
        Hilo1 h1 = new Hilo1(printer);
        Hilo2 h2 = new Hilo2(printer);

        // Llama a los métodos de inicialización de los hilos
        h1.start();
        h2.start();
    }
}
