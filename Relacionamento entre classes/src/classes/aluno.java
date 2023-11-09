package classes;
import java.util.ArrayList;




public class aluno extends pessoa {
    private curso curso;
    private ArrayList<Double> notas;

    public aluno() {
        notas = new ArrayList<>();
    }

    public curso getCurso() {
        return curso;
    }

    public void setCurso(curso curso) {
        this.curso = curso;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        curso.imprimirCurso();
        System.out.println("Notas:");
        for (Double nota : notas) {
            System.out.println(nota);
        }
    }
}
