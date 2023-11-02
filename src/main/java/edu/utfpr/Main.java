package edu.utfpr;

public class Main {
    public static void main(String[] args) {
        Professor professorEfetivo = new ProfessorEfetivo("João");
        Professor professorSubstituto = new ProfessorSubstituto("Maria");

        professorEfetivo.lecionar("Arquitetura de Software");
        System.out.println();
        professorSubstituto.lecionar("Arquitetura de Software");
    }
}