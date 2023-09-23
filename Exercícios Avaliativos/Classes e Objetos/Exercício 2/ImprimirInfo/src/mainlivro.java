

import java.util.Scanner;

import Classes.livro;

public class mainlivro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informo o Título do livro");
        String titulo = scanner.nextLine();

        System.out.println("Informe o autor do livro " );
        String autor = scanner.nextLine();

        System.out.println("Informe a quantidade de paginas: ");
        int numPaginas = scanner.nextInt();

        
        
        
        livro meuLivro = new livro(titulo,autor,numPaginas);

        meuLivro.imprimirinfo();

    }
}
