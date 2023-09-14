package com.linuxtips.descomplicandojavaespring.day06.abstracao;

public class BancoMain {
    public static void main(String[] args) {
        System.out.println("Seja bem-vindo ao LINUXtips Bank!");

        ContaCorrente ccMateus = new ContaCorrente();
        ccMateus.consultaSaldo();
        ccMateus.fazPix();

        ContaPoupanca cpMateus = new ContaPoupanca();
        cpMateus.consultaSaldo();
        cpMateus.fazPix();
    }
}
