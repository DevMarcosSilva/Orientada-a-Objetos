package classes;
public class curso {
    private String nome;
    private professor professor; 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public professor getProfessor() {
        return professor;
    }

    public void setProfessor(professor professor) {
        this.professor = professor;
    }

    public void imprimirCurso() {
        System.out.println("Curso: " + this.nome);
        if (professor != null) {
            System.out.println("Professor do Curso:");
            professor.imprimir(); // Imprime as informações do professor
        }
    }
}
