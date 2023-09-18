package com.linuxtips.descomplicandojavaespring.day06.interfaces;

public class ContaCorrente implements Conta {

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo é R$0,00");
    }

    @Override
    public void fazerPix() {
        System.out.println("Você recebeu um pix no valor de R$ 0,01");
    }
}
