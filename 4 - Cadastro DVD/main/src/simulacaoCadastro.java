import classes.*;

import java.util.Scanner;

public class simulacaoCadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o código do produto: ");
        int codigo = scanner.nextInt();

        System.out.print("Informe o preço do produto: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Informe o nome do produto: ");
        String nome = scanner.nextLine();

        
        System.out.print("O produto é um DVD (D) ou um CD (C)? ");
        char tipo = scanner.next().charAt(0);

        midia midia = null;
        if (tipo == 'D' || tipo == 'd') {
            System.out.print("Informe o número de faixas do DVD: ");
            int faixas = scanner.nextInt();
            midia = new dvd(codigo, preco, nome, faixas);
        } else if (tipo == 'C' || tipo == 'c') {
            System.out.print("Informe o número de músicas do CD: ");
            int musicas = scanner.nextInt();
            midia = new cd(codigo, preco, nome, musicas);
        } else {
            System.out.println("Tipo de mídia inválido. Encerrando o programa.");
            return;
        }

    
        midia.printDados();

        
        scanner.close();
    }
}
