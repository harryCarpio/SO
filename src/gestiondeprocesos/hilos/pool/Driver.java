package gestiondeprocesos.hilos.pool;

import java.util.concurrent.*;

public class Driver {
    public static void main(String[] args) {
        int upper = Integer.parseInt("5");
        Executors Executors = null;
        ExecutorService pool = Executors.newSingleThreadExecutor();
        Future<Integer> result = pool.submit(new Summation(upper));
        try {
            System.out.println("sum = " + result.get());
        } catch (InterruptedException | ExecutionException ie) { }
    }
}

class Summation implements Callable<Integer> {
    private int upper;
    public Summation(int upper) {
        this.upper = upper;
    }

    /* The thread will execute in this method */
    public Integer call() {
        int sum = 0;
        for (int i = 1; i <= upper; i++) {
            sum += i;
        }
        return new Integer(sum);
    }
}