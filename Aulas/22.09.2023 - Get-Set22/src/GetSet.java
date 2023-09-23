import Classes.Aluno;
import Classes.EdIfantil;

public class GetSet {
    public static void main(String[] args) throws Exception {
       Aluno aluno1 = new Aluno("cleiton","0151",-1);
       aluno1.setidade(20);
       EdIfantil aluno2 = new EdIfantil("maria", "1564645644", 20);
       aluno2.setidade(5);
       System.out.println("Aluno 1: ");
       System.out.println("Aluno: "+aluno1.getnome()+ "\nmatricula: "+aluno1.getmatricula()+ "\nidade: "+aluno1.getidade());
       System.out.println("\nAluno 2: ");
       System.out.println("Aluno: "+aluno2.getnome()+ "\nmatricula: "+aluno2.getmatricula()+ "\nidade: "+aluno2.getidade());
    }
}
