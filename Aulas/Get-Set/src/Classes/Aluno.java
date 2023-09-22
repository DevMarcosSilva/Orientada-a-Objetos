package Classes;

public class Aluno {

    private String Nome;
    private String Matricula;
    private int idade;

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public void setMatricula(String matricula) {
        this.Matricula = matricula;

    }

    public void setIdade(int idade) {
        if (idade > 0) {

            this.idade = idade;
        }
        else {
            System.out.println("Idade inválida");
        }

    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getIdade() {
        return idade;
    }
}
