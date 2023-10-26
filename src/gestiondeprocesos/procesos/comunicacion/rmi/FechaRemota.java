package gestiondeprocesos.procesos.comunicacion.rmi;

import java.rmi.*;
import java.util.Date;

public interface FechaRemota extends Remote{
    public Date getDate() throws RemoteException;
}
