package gestiondeprocesos.concurrencia.monitor;

public class Hilo2 extends Thread{
    DataPrinterCompartido dp;

    public Hilo2(DataPrinterCompartido dp) {
        this.dp = dp;
    }

    public void run() {
        // Print statement
        dp.display("-UNIB.E-2023");
    }
}
