package gestiondeprocesos.concurrencia.interbloqueo.ejemplo;

import java.util.concurrent.locks.Lock;

public class HiloB implements Runnable{
    private Lock primera, segunda;

    public HiloB(Lock primera, Lock segunda){
        this.primera = primera;
        this.segunda = segunda;
    }

    @Override
    public void run() {
        try{
            segunda.lock();
            // cualquier lógica de programa puede ir entre los dos locks
            primera.lock();
            // cualquier lógica de programa puede ir después del segundo lock
        } finally {
            segunda.unlock();
            primera.unlock();
        }
    }
}
