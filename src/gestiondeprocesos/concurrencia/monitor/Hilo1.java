package gestiondeprocesos.concurrencia.monitor;

public class Hilo1 extends Thread{
    DataPrinterCompartido dp;

    public Hilo1(DataPrinterCompartido dp) {
        this.dp = dp;
    }

    public void run() {
        // Print statement
        dp.display("Sistemas Operativos");
    }
}
