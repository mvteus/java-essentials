package com.linuxtips.descomplicandojavaespring;

public class Day03 {
    public static void main(String[] args) {

        // Byte: valores inteiros ou negativos, 8 bits, máximo 127 e mínimo -128
        byte meuByte = 127;
        System.out.println("Meu byte: " + meuByte);

        // Short: Dobro do que o Byte, 16 bits, máximo 32767 e mínimo -32768
        short meuShort = 32767;
        System.out.println("Meu short: " + meuShort);

        // Int: Dobro do Short, 32 bits, máximo 2174783647 e mínimo -2147483648
        int meuInt = 25;
        System.out.println("Meu int: " + meuInt);

        // Long: 64 bits
        long meuLong = 25L;
        System.out.println("Meu long: " + meuLong);

        // Double: 64 bits e dupla precisão
        double meuDouble = 50.4;
        System.out.println("Meu double: " + meuDouble);

        // Float: 32 bits e precisão simples
        float meuFloat = 102.51F;
        System.out.println("Meu float: " + meuFloat);

        // Char: 16 bits, aloca um unicode
        char meuChar = 'Z';
        System.out.println("Meu char: " + meuChar);

        // Boolean: 1 bit, verdadeiro ou falso
        boolean meuBoolean = false;
        System.out.println("Meu boolean: " + meuBoolean);
    }

}
