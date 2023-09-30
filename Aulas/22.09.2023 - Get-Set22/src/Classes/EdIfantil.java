package Classes;

public class EdIfantil extends Aluno {
    public EdIfantil(String Nome, String Matricula, int idade) {
        super(Nome, Matricula, idade);
    }

    public void setidade(int idade) {
        if (idade > 4 && idade < 7) {
            super.setidade(idade);
        }
        else{
            System.out.println("idade inválida");
        }
    }

    private String responsavel;

    public void setresponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getresponsavel() {
        return responsavel;
    }
}
