package gestiondeprocesos.concurrencia.monitor;

public class Hilo2 extends Thread{
    DataPrinterCompartido dp;

    public Hilo2(DataPrinterCompartido dp) {
        this.dp = dp;
    }

    public void run() {
        // Print statement
        dp.display("Sistemas Operativos");
    }
}
