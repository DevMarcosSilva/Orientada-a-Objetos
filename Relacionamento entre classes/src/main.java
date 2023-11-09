import classes.aluno;
import classes.curso;
import classes.disciplina;
import classes.pessoa;
import classes.professor;

public class main {
    public static void main(String[] args) {
        
        professor professor1 = new professor();
        professor1.setNome("Prof. João");
        professor1.setCpf("12345678901");
        professor1.setEmail("joao@email.com");
        professor1.setTitulacao("Doutor");
        professor1.setSalario(5000.0);

        curso curso1 = new curso();
        curso1.setNome("Engenharia de Software");

        curso1.setProfessor(professor1);

        aluno aluno1 = new aluno();
        aluno1.setNome("Alice");
        aluno1.setCpf("98765432101");
        aluno1.setEmail("alice@email.com");

        aluno aluno2 = new aluno();
        aluno2.setNome("Bob");
        aluno2.setCpf("56789012301");
        aluno2.setEmail("bob@email.com");

        disciplina disciplina1 = new disciplina();
        disciplina1.setNome("Programação Java");

        disciplina1.setProfessor(professor1);

        disciplina1.adicionarAluno(aluno1);
        disciplina1.adicionarAluno(aluno2);

        System.out.println("Informações do Professor:");
        professor1.imprimir();

        System.out.println("\nInformações do Curso:");
        curso1.imprimirCurso();

        System.out.println("\nInformações da Disciplina:");
        disciplina1.imprimir();
    }
}
