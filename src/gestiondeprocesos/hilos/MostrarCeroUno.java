package gestiondeprocesos.hilos;

public class MostrarCeroUno {
    public void mostrarNumero(String numero) {
        for (int i = 1; i <= 10; i++)
            System.out.print(numero+"-");
    }

    public static void main(String[] args) {
        MostrarCeroUno m=new MostrarCeroUno();
        m.mostrarNumero("0");
        m.mostrarNumero("1");
    }
}
