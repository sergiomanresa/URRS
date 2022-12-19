package guardar_clientes;

public class Main {
    public static void generarCliente(Cliente[] listadoCliente){
        listadoCliente[0]=new Cliente("antoni","carmona","1233456fd");
        listadoCliente[0]=new Cliente("pele","carmona","43579cxv");
        listadoCliente[0]=new Cliente("lola","carmona","43098cfds");
        listadoCliente[0]=new Cliente("gio","carmona","45098cx");
        listadoCliente[0]=new Cliente("paloma","carmona","3298309fd");
        listadoCliente[0]=new Cliente("joan","carmona","95443209gfd");
        listadoCliente[0]=new Cliente("fulgensio","carmona","329854fgf");
        listadoCliente[0]=new Cliente("penelope","carmona","32456787gf");
    }
    public static void mostrarClientes(Cliente[] listadoCliente){
        for(Cliente c : listadoCliente){
            c.toString();
        }
    }

    public static void main(String[] args) {
        Cliente[] listadoCliente=new Cliente[50];
    }
}
