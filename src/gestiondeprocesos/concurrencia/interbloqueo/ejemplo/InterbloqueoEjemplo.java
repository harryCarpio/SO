package gestiondeprocesos.concurrencia.interbloqueo.ejemplo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class InterbloqueoEjemplo {
    public static void main(String args[]){
        Lock lockX = new ReentrantLock();
        Lock lockY = new ReentrantLock();

        Thread hiloA = new Thread(new HiloA(lockX, lockY));
        Thread hiloB = new Thread(new HiloB(lockX, lockY));

        hiloA.start();
        hiloB.start();
    }

}
