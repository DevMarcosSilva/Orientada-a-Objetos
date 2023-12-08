package classes;

public class cd extends midia {
    int musicas;

    public cd(int codigo, double preco, String nome, int musicas) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
        this.musicas = musicas;
    }

    @Override
    String getTipo() {
        return "CD";
    }

    @Override
    String getDetalhes() {
        return "Código: " + codigo + "\nPreço: " + preco + "\nNome: " + nome + "\nMúsicas: " + musicas;
    }

    @Override
    public void printDados() {
        System.out.println(getTipo() + " - Detalhes:\n" + getDetalhes());
    }
}
