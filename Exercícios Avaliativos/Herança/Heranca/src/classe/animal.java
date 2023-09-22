package classe;

public class animal {
    //atributos
    private String nome;
    private double peso;    

    //construtor
    public animal(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }
    
    public double getPeso() {
        return peso;
    }
}
