package canciones;

public class cancion {
    //Atributo
    private String titulo;
    private String autor;
    //constructor
    public cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    //constructor vacio
    cancion(){}

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
