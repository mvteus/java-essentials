package com.linuxtips.descomplicandojavaespring.day06;

public class Estudante {

    /* Atributos do objeto */
    private String nome;
    private String stack;


    /* Getters & Setters, usados para definir/obter os atributos através das instâncias da classe Estudante */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    /* Métodos, são as ações da classe Estudante, e.g. estudar, comer e dormir */
    public String estudar() {
        return "Estou estudando na LINUXtips!";
    }

    public void dormir() {

    }
}
