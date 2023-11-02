package edu.utfpr;

public class Main {
    public static void main(String[] args) {
        Professor professorEfetivo = new ProfessorEfetivo("João");
        Professor professorSubstituto = new ProfessorSubstituto("Maria");

        professorEfetivo.lecionar("POO");
        System.out.println();
        professorSubstituto.lecionar("POO");
    }
}