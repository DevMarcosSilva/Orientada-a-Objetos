package classes;
import java.util.ArrayList;

public class professor extends pessoa {
    private String titulacao;
    private double salario;
    private ArrayList<curso> cursos = new ArrayList<>();

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ArrayList<curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<curso> cursos) {
        this.cursos = cursos;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.printf("Titulação: %s\nSalário: %.2f\n", this.titulacao, this.salario);
        System.out.println("Cursos:");
        for (curso curso : getCursos()) {
            curso.imprimirCurso();
        }
    }
}
