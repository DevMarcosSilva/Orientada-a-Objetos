import java.util.Scanner;

public class ScannerCadastro {
    public static void main(String[] args) {
        Scanner Dados = new Scanner(System.in);

        String Pessoa, Pet, veiculo;
        int idade;
        float altura;

        System.out.println("Informe o nomee da pessoa que deseja cadastrar: ");
        Pessoa = Dados.nextLine();

        System.out.println("Informe o Pet da Pessoa caso não tenha digite (Não): ");
        Pet = Dados.nextLine();

        System.out.println("Informe o veiculo da pessoa: ");
        veiculo = Dados.nextLine();

        System.out.print("Informe a idade da pessoa : ");
        idade = Dados.nextInt();

        System.out.print("Informe sua altura da pessoa: ");
        altura = Dados.nextFloat();

        System.out.printf("Nome informado: %s\n", Pessoa);
        System.out.printf("Pet informado: %s\n", Pet);
        System.out.printf("Veiculo informado: %s\n", veiculo);
        System.out.printf("Idade informada: %d\n", idade);
        System.out.printf("Altura informada: %f\n", altura);

        Dados.close();
    }
}
