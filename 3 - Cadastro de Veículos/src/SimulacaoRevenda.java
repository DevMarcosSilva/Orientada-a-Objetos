import java.util.ArrayList;
import java.util.Scanner;

import classes.carro;
import classes.moto;
import classes.veiculo;

public class SimulacaoRevenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<veiculo> veiculos = new ArrayList<>();

        while (true) {
            exibirMenu();
            int escolha = scanner.nextInt();

            if (escolha == 0) {
                break;
            }

            switch (escolha) {
                case 1:
                    adicionarCarro(scanner, veiculos);
                    break;
                case 2:
                    adicionarMoto(scanner, veiculos);
                    break;
                default:
                    System.out.println("Escolha inválida.");
            }
        }

        exibirRelatorio("Relatório de Veículos:", veiculos);

        

        exibirRelatorio("Relatório de Veículos Após Ajustes:", veiculos);

        double totalPrecoDepois = calcularTotalPreco(veiculos);
        System.out.println("Total de preços após os ajustes: " + totalPrecoDepois);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("Escolha o tipo de veículo:");
        System.out.println("(1) Carro");
        System.out.println("(2) Moto");
        System.out.println("(0) Sair");
        System.out.print("Opção: ");
    }

    private static void adicionarCarro(Scanner scanner, ArrayList<veiculo> veiculos) {
        System.out.print("Informe o modelo do carro: ");
        String modelo = scanner.next();
        System.out.print("Informe o preço do carro: ");
        double preco = scanner.nextDouble();
        System.out.print("Informe a quilometragem do carro: ");
        double km = scanner.nextDouble();

        veiculos.add(new carro(modelo, preco, km));
    }

    private static void adicionarMoto(Scanner scanner, ArrayList<veiculo> veiculos) {
        System.out.print("Informe o modelo da moto: ");
        String modelo = scanner.next();
        System.out.print("Informe o preço da moto: ");
        double preco = scanner.nextDouble();
        System.out.print("Informe o ano da moto: ");
        double ano = scanner.nextDouble();

        veiculos.add(new moto(modelo, preco, ano));
    }

    private static void exibirRelatorio(String titulo, ArrayList<veiculo> veiculos) {
        System.out.println(titulo);
        for (veiculo veiculo : veiculos) {
            veiculo.printDados();
            System.out.println("--------");
        }
    }

    private static double calcularTotalPreco(ArrayList<veiculo> veiculos) {
        double total = 0;
        for (veiculo veiculo : veiculos) {
            total += veiculo.getPreco();
        }
        return total;
    }
}
