package gestiondeprocesos.procesos.comunicacion.rmi;

import java.rmi.Naming;

public class ClienteRMI {
    static final String servidor = "127.0.0.1";

    public static void main(String args[]){
        try{
            String host = "rmi://"+servidor+"/RMIDateObject";
            FechaRemota fechaServidor = (FechaRemota) Naming.lookup(host);
            System.out.println(fechaServidor.getDate());
        }catch(Exception e){
            System.err.println(e);
        }
    }
}
