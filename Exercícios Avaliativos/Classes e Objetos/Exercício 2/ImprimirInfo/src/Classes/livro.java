package Classes;

import java.util.Scanner;

public class livro {
    
    public String titulo;
    public String autor;
    public int numPaginas;

    public livro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
       

    }

    public void imprimirinfo() {

        System.out.println("Título: " + titulo + "\nAutor: " + autor + "\nNumero de páginas: " + numPaginas);

    }
}
