package classes;

public abstract class midia {
    int codigo;
    double preco;
    String nome;

    abstract String getTipo();
    abstract String getDetalhes();
    
    public void printDados() {
        System.out.println(getTipo() + " - Detalhes:\n" + getDetalhes());
    }
}
