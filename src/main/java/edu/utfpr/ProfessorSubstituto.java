package edu.utfpr;

/**
 * Proxy para Professor Efetivo de POO.
 *
 * @author Daniel Fonseca <danielfonseca@alunos.utfpr.edu.br>
 */
public class ProfessorSubstituto implements Professor {
    private final String nome;
    private final Professor professor = new ProfessorEfetivo("João");

    public ProfessorSubstituto(String nome) {
        this.nome = nome;
    }

    @Override
    public void lecionar(String disciplina) {
        if (disciplina.equals("POO")) {
            System.out.println("Professor substituto " + nome + " lecionando " + disciplina);
        } else {
            professor.lecionar(disciplina);
        }
    }
}
