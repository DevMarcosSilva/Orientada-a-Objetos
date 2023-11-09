package classes;

import java.util.ArrayList;

public class disciplina {
    private String nome;
    private professor professor;
    private ArrayList<aluno> alunos;
    
    public disciplina() {
        alunos = new ArrayList<>();
    }

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

    public ArrayList<aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<aluno> alunos) {
        this.alunos = alunos;
    }

    public void adicionarAluno(aluno aluno) {
        alunos.add(aluno);
    }

    public void imprimir() {
        System.out.printf("Disciplina: %s\n", nome);
        System.out.println("Professor:");
        professor.imprimir();
        System.out.println("Alunos:");
        for (aluno aluno : alunos) {
            aluno.imprimir();
        }
    }
}

