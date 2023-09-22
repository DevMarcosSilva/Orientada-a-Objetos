public class EdIfantil extends Aluno {
    public EdIfantil(String Nome, String Matricula, int idade) {
        super(Nome, Matricula, idade);
    }

    public void setIdade(int idade) {
        if (idade > 4 && idade < 7) {
            super.setIdade(idade);
        }
        else{
            System.out.println("Idade inválida");
        }
    }

    private String Responsavel;

    public void setResponsavel(String Responsavel) {
        this.Resposavel = Resposavel;
    }

    public String Responsavel() {
        return Responsavelesponsavel;
    }
}
