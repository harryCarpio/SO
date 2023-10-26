package gestiondeprocesos.hilos;

public class MostrarCeroUnoHilo {
    public static void main(String[] args) {
        HiloMostrarCero h1 = new HiloMostrarCero();
        h1.start();
        HiloMostrarUno h2 = new HiloMostrarUno();
        h2.start();
    }
}

class HiloMostrarCero extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++)
            System.out.print("0-");
    }
}

class HiloMostrarUno extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++)
            System.out.print("1-");
    }
}