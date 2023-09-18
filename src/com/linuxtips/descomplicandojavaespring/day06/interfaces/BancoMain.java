package com.linuxtips.descomplicandojavaespring.day06.interfaces;

public class BancoMain {
    public static void main(String[] args) {
        System.out.println("Seja bem-vindo ao Interface Bank!");
        ContaCorrente ccMateus = new ContaCorrente();
        ccMateus.consultarSaldo();
        ccMateus.fazerPix();

        ContaPoupança cpMateus = new ContaPoupança();
        cpMateus.consultarSaldo();
        cpMateus.fazerPix();

    }
}
