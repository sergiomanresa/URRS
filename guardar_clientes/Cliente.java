package guardar_clientes;

public class Cliente {
  private String nombre;
  private String apellidos;
  private String telefono;
  private String email;
  private String fecha_de_nacimiento;
  private String dni;

    Cliente(){}

    public Cliente(String nombre, String apellidos, String telefono, String email, String fecha_de_nacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }

    public Cliente(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFecha_de_nacimiento() {
        return fecha_de_nacimiento;
    }

    public void setFecha_de_nacimiento(String fecha_de_nacimiento) {
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
