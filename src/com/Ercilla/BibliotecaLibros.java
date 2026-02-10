package com.Ercilla;

public class BibliotecaLibros {
    public static void main(String[] args){
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro(new Terror("Stephen King", "It", 9));
        biblioteca.agregarLibro(new CienciaFiccion("Asimov", "Fundación", "Trantor"));
        biblioteca.agregarLibro(new NovelaNegra("Agatha Cristie", "Diez negritos", "Wargrave"));
        biblioteca.agregarLibro(new NovelaRomantica("Jane Austen", "Orgullo y Prejuicio", true));

        biblioteca.mostrarLibros();

        System.out.println("_______ Préstamos______");
        biblioteca.prestarLibros();

        System.out.println("________ Prestar otra vez______");
        biblioteca.prestarLibros();
    }
}