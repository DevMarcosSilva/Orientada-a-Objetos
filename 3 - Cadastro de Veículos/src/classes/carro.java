package classes;
import java.util.Scanner;

public class carro extends veiculo {
    double km;

    public carro(String modelo, double preco, double km) {
        super(modelo, preco);
        this.km = km;
    }

    void setKm(double km) {
        this.km = km;
    }

    void insertData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a quilometragem do carro: ");
        double km = scanner.nextDouble();
        setKm(km);
        scanner.close();
    }
}
