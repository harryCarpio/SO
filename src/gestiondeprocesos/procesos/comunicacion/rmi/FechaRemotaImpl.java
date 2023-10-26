package gestiondeprocesos.procesos.comunicacion.rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class FechaRemotaImpl extends UnicastRemoteObject implements FechaRemota {
    public FechaRemotaImpl() throws RemoteException {
    }

    public Date getDate() throws RemoteException {
        return new Date();
    }

    public static void main(String[] args){
        try{
            FechaRemota fechaServidor = new FechaRemotaImpl();

            Naming.rebind("RMIDataObject", fechaServidor);
        }catch(Exception e){
            System.err.println(e);
        }
    }
}
