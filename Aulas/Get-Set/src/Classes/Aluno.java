package Classes;

public class Aluno {

    private String nome;
    private String matricula;
    private int idade;

    public Aluno(String nome, String matricula, int idade){
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
    }

    public void setnome(String nome) {
        this.nome = nome;

    }

    public void setmatricula(String matricula) {
        this.matricula = matricula;

    }

    public void setidade(int idade) {
        if (idade > 0) {

            this.idade = idade;
        }
        else {
            System.out.println("idade inválida");
        }

    }

    public String getnome() {
        return nome;
    }

    public String getmatricula() {
        return matricula;
    }

    public int getidade() {
        return idade;
    }
}
