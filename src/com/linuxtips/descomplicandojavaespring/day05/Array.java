package com.linuxtips.descomplicandojavaespring.day05;

import java.util.Arrays;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        /*
         *
         * O que é um Array?
         *
         * É uma estrutura de dados simples para armazenar uma coleção de elementos
         *
         */
        int[] arrayDeInt; // Forma mais comum de declaração de arrays

        int arrayDeInt2[]; // Forma menos comum de declaração de arrays

        int[] arrayDeInt3 = new int[20]; // Inicializando o array com 20 elementos do tipo int (caso você já saiba o número de elementos)

        Integer[] arrayDeInt4 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; // Preenchendo o array com 10 elementos

        int tamanhoDoArray = arrayDeInt4.length; // .lenght para descobrir o tamanho do array
        System.out.println("Tamanho do Array: " + tamanhoDoArray);

        List<Integer> itens = Arrays.asList(arrayDeInt4); // Percorrendo o array como List
        itens.forEach(System.out::println);

        String[] treinamento = new String[]{"Treinamento", "Descomplicando", "Java", "e", "Spring", "da", "LINUXtips"};
        String[] treinamentoNome = Arrays.copyOfRange(treinamento, 1, 5);
        // String[] linuxTipsNome = Arrays.copyOfRange(treinamento, 2, 4);
        List<String> treinamentoNomeList = List.of(treinamento);
        List<String> treinamentoList = List.of(treinamentoNome);
        treinamentoList.forEach(System.out::println);
        treinamentoNomeList.forEach(System.out::println);

        String[] arrayCom3 = Arrays.copyOf(treinamentoNome, 3);
        List<String> arrayCom3List = List.of(arrayCom3);
        arrayCom3List.forEach(System.out::println);

        /* Preenchendo um array com método fill */
        String[] java = new String[10];
        Arrays.fill(java, "java");
        List<String> javaList = List.of(java);
        javaList.forEach(System.out::println);

        /* Comparando dois array com método equals */
        int[] arrayDeInteiros = {
                0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        };

        int[] outroArrayDeInteiros = {
                1, 2, 3, 4, 5, 6, 7, 8, 9
        };

        System.out.println("Os arrays são iguais? " + Arrays.equals(arrayDeInteiros, outroArrayDeInteiros));

        /* Ordenando um array com método sorted */

        String[] sorted = Arrays.copyOf(treinamento, 8);
        Arrays.sort(sorted);
        List<String> sortedList = List.of(sorted);
        sortedList.forEach(System.out::println);
    }
}