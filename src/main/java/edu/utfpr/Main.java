package edu.utfpr;

/**
 * Aplicação para exemplificar o padrão Proxy.
 *
 * @author Daniel Fonseca <danielfonseca@alunos.utfpr.edu.br>
 */
public class Main {
    public static void main(String[] args) {
        Professor professor = new ProfessorSubstituto("José");
        professor.lecionar("POO");
        professor.lecionar("Cálculo");
    }
}