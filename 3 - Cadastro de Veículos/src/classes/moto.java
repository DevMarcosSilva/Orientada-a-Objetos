package classes;
import java.util.Scanner;

public class moto extends veiculo{
    double ano;

    public moto(String modelo, double preco, double ano) {
        super(modelo, preco);
        this.ano = ano;
    }

    void setAno(double ano) {
        this.ano = ano;
    }

    void insertData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o ano da moto: ");
        double ano = scanner.nextDouble();
        setAno(ano);
        scanner.close();
    }
}
