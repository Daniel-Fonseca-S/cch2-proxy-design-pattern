package edu.utfpr;

public class ProfessorSubstituto implements Professor{
    private final String nome;

    public ProfessorSubstituto(String nome) {
        this.nome = nome;
    }

    @Override
    public void lecionar(String disciplina) {
        System.out.println("Estudando material do professor efetivo");
        System.out.println("Professor substituto " + this.nome + " lecionando " + disciplina);
        System.out.println("Reportando progresso da turma de " + disciplina + " para o professor efetivo");
    }
}
