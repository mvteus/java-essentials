package com.linuxtips.descomplicandojavaespring;
public class Operadores {
    public static void main(String[] args) {
        // Operador de atribuição
        int idade = 25;
        System.out.println("Valor atraibuído a idade: " + idade);

        // Operadores matemáticos
        int soma = idade + 5; // Adição
        System.out.println("Resultado da soma: " + soma);
        int multiplica = soma * 2; // Multiplicação
        System.out.println("Resultado da multiplicação: " + multiplica);
        int div = multiplica / 2; // Divisão
        System.out.println("Resultado da divisão: " + div);
        int modulo = div % 4; // Módulo sabemos o resto da divisão
        System.out.println("Resultado do módulo: " + modulo);

        // Operadores de incremento e decremento
        int incremento = 15;
        System.out.println("Valor original antes do incremento.");
        incremento++; // Incremento
        System.out.println("Valor após incremento: " + incremento);

        int decremento = 20;
        System.out.println("Valor original antes do decremento.");
        decremento++; // Decremento
        System.out.println("Valor após decremento: " + decremento);

        // Operadores de igualdade
        long val1 = 1L;
        long val2 = 2L;

        if (val1 == val2) { // Exemplo de uso de operador igual (==)
            System.out.println("Valores iguais.");
        } else {
            System.out.println("Valores diferentes.");
        }

        double val3 = 10.2;
        double val4 = 100.2;

        if (val3 != val4) { // Exemplo de uso de operador diferente (!=)
            System.out.println("Valores diferentes.");
        } else {
            System.out.println("Valores iguais.");
        }

        // Operadores relacionais
        int primeiroValor = 1234;
        int segundoValor = 12345;

        if (primeiroValor > segundoValor) { // Exemplo de uso de operador maior (>)
            System.out.println(primeiroValor + " é maior que " + segundoValor);
        }

        if (primeiroValor >= segundoValor) { // Exemplo de uso de operador maior ou igual (>=)
            System.out.println(primeiroValor + " é maior o igual que " + segundoValor);
        }

        if (primeiroValor < segundoValor) { // Exemplo de uso de operador menor (<)
            System.out.println(primeiroValor + " é menor que " + segundoValor);
        }

        if (primeiroValor <= segundoValor) { // Exemplo de uso de operador menor ou igual (<)
            System.out.println(primeiroValor + " é menor ou igual que " + segundoValor);
        }

        // Operadores lógicos
        boolean verdadeiro = true;
        boolean falso = false;
        System.out.println(verdadeiro || falso); // 1 + 0 = 1
        System.out.println(verdadeiro && falso); // 1 * 0 = 0

    }
}