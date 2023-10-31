package gestiondeprocesos.concurrencia.interbloqueo.ejemplo;

import java.util.concurrent.locks.Lock;

public class HiloA implements Runnable{
    private Lock primera, segunda;

    public HiloA(Lock primera, Lock segunda){
        this.primera = primera;
        this.segunda = segunda;
    }

    @Override
    public void run() {
        try{
            primera.lock();
            // cualquier lógica de programa puede ir entre los dos locks
            segunda.lock();
            // cualquier lógica de programa puede ir después del segundo lock
        } finally {
            primera.unlock();
            segunda.unlock();
        }
    }
}
