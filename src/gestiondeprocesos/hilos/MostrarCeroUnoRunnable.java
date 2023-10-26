package gestiondeprocesos.hilos;

public class MostrarCeroUnoRunnable {
    public static void main(String[] args) {
        HiloMostrarCeroRunnable h1 = new HiloMostrarCeroRunnable();
        HiloMostrarUnoRunnable h2 = new HiloMostrarUnoRunnable();
    }
}

class HiloMostrarCeroRunnable implements Runnable {
    private Thread t;

    public HiloMostrarCeroRunnable() {
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        for (int f = 1; f <= 10; f++) {
            System.out.print("0-");
            /*
            try {
                t.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            */
        }

    }
}

class HiloMostrarUnoRunnable implements Runnable {
    private Thread t;

    public HiloMostrarUnoRunnable() {
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        for (int f = 1; f <= 10; f++) {
            System.out.print("1-");
            /*
            try {
                t.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            */
        }
    }
}