package com.linuxtips.descomplicandojavaespring.day04;

import java.util.Scanner;

public class Repeticao {
    public static void main(String[] args) {

        /* Repetição for */

        for (int i = 0; i <= 100; i++) {
            System.out.println("Repetição i está valendo " + i);
        }

        /* Repetição while */

        Scanner in = new Scanner(System.in);
        var valorSecreto = 0;
        while (valorSecreto != 12345) {
            System.out.println("Adivinhe o valor secreto!");
            valorSecreto = in.nextInt();
            if (valorSecreto == 12345) {
                System.out.println("Você acertou o valor secreto. \nParabéns");
            } else {
                System.out.println("Não é esse valor. \nTente novamente!");
            }
        }

        /* Repetição do while */

        int val = 10;
        do {
            System.out.println("val");
            val++;
        } while (val <= 50);
    }
}