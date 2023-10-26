package gestiondeprocesos.concurrencia.monitor;

public class SinMonitor {
    public static void main(String[] args) {
        Thread t1 = new MiHilo("Sistemas Operativos");
        Thread t2 = new MiHilo("-UNIB.E-2023");

        t1.start();
        t2.start();
    }
}

class MiHilo extends Thread{
    private String str;
    public MiHilo(String str){
        this.str = str;
    };

    @Override
    public void run() {
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