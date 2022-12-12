package ejercicio_libro;

public class Main {
    public static void main(String[] args) {
        Libro libro;

        libro=new Libro();


        libro.numero_pagina=456;
        libro.autor="pepe";
        libro.editorial="muñon";
        libro.isbn=446;
        libro.precio=3.14f;
        libro.titulo="pepe";

        libro.informacion();
        libro.descuento();
    }
}