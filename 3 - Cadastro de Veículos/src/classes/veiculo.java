package classes;

public class veiculo {
    String modelo;
    double preco;

    public veiculo(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void printDados() {
        System.out.println("Modelo: " + modelo + "\nPreço: " + preco);
    }
}
