package edu.utfpr;

public class ProfessorEfetivo implements Professor{
    private final String nome;

    public ProfessorEfetivo(String nome) {
        this.nome = nome;
    }

    @Override
    public void lecionar(String disciplina) {
        System.out.println("Professor " + this.nome + " lecionando " + disciplina);
    }
}
