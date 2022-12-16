package URRS.Cancion;

public class Cancion {
    //Atributo
    private String titulo;
    private String autor;
    //constructor
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    //constructor vacio
    Cancion(){}

    //metodos

    public String dameTitulo() {
        return titulo;
    }

    public void ponTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String dameAutor() {
        return autor;
    }

    public void ponAutor(String autor) {
        this.autor = autor;
    }
}
