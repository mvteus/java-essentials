package com.linuxtips.descomplicandojavaespring.day06;

public class Objetos {
    public static void main(String[] args) {
        Estudante mateusSouza = new Estudante();

        /* Setting attributes */
        mateusSouza.setNome("Mateus Souza da Silva");
        mateusSouza.setStack("Java & Spring");

        /* Getting attributes */
        System.out.println(mateusSouza.getNome());
        System.out.println(mateusSouza.getStack());

        /* Usando os métodos da classe Estudante */
        System.out.println(mateusSouza.estudar());
        mateusSouza.dormir();

    }
}
