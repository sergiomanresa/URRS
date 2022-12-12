package ejercicio_libro;

public class Libro {
    String titulo;
    int isbn;
    String autor;
    String editorial;
    float precio;
    int numero_pagina;

    public void informacion(){
        System.out.printf("titulo:%s\n isbn:%d\n autor:%s\n editorial:%s\n precio:%.2f\n numero_pagina:%d\n",this.titulo,this.isbn,this.autor,this.editorial,this.precio,this.numero_pagina);
    }
    public void descuento(){
        double porcentaje=0.2;
        double precion=this.precio*porcentaje;
        double precio_final=this.precio-precion;
        System.out.printf("el precio final es:"+String.valueOf(precio_final));

    }
}
