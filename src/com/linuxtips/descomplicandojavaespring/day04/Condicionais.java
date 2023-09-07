package com.linuxtips.descomplicandojavaespring.day04;

public class Condicionais {
    public static void main(String[] args) {

        long val1 = 1L;
        long val2 = 1L;

        /* Condicional if else */

        if (val1 == val2) {
            System.out.println("Iguais");
        } else if (val1 < val2) {
            System.out.println("Valor " + val1 + " é menor que " + val2);
        } else {
            System.out.println("Diferentes");
        }

        /* Condicional switch case */

        String nomeDoMes = "Fevereiro";

        switch (nomeDoMes) {
            case "Janeiro":
                System.out.println(1);
                break;
            case "Fevereiro":
                System.out.println(2);
                break;
            case "Março":
                System.out.println(3);
                break;
            case "Abril":
                System.out.println(4);
                break;
            case "Maio":
                System.out.println(5);
                break;
            case "Junho":
                System.out.println(6);
                break;
            case "Julho":
                System.out.println(7);
                break;
            case "Agosto":
                System.out.println(8);
                break;
            case "Setembro":
                System.out.println(9);
                break;
            case "Outubro":
                System.out.println(10);
                break;
            case "Novembro":
                System.out.println(11);
                break;
            case "Dezembro":
                System.out.println(12);
                break;
            default:
                System.out.println("Que mês é esse?");
        }
    }
}
