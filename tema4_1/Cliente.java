package tema4_1;

import java.util.Date;

public class Cliente {
    //atributos
    String dni;
    String nombre;
    String apellido;
    Date fehca_nacimiento;
    boolean soltero;
    int num_hijos;
    String email;
    String telefono;

    //metodos
    public int edad_cliente(){
        return 0;
    }
    public void info_cliente(){
        System.out.println("nombre:"+this.nombre);
        System.out.println("apellidos:"+this.apellido);
        System.out.println("telefono:"+this.telefono);
        System.out.println("email:"+this.email);
    }
}
