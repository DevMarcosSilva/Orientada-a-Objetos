package classes;

public class dvd extends midia {
    int faixas;

    public dvd(int codigo, double preco, String nome, int faixas) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
        this.faixas = faixas;
    }

    @Override
    String getTipo() {
        return "DVD";
    }

    @Override
    String getDetalhes() {
        return "Código: " + codigo + "\nPreço: " + preco + "\nNome: " + nome + "\nFaixas: " + faixas;
    }

    @Override
    public void printDados() {
        System.out.println(getTipo() + " - Detalhes:\n" + getDetalhes());
    }
}
