package Composicion;

public class Piloto {
    private String nombre;
    private Float altura;
    private int num_fed;

    public Piloto(){}

    public Piloto(String nombre, Float altura, int num_fed) {
        this.nombre = nombre;
        this.altura = altura;
        this.num_fed = num_fed;
    }

    @Override
    public String toString() {
        return "Piloto{" +
                "nombre='" + nombre + '\'' +
                ", altura=" + altura +
                ", num_fed=" + num_fed +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public int getNum_fed() {
        return num_fed;
    }

    public void setNum_fed(int num_fed) {
        this.num_fed = num_fed;
    }
}
