package com.linuxtips.descomplicandojavaespring.day06.abstracao;

public class ContaPoupanca extends Conta {
    @Override
    public void consultaSaldo() {
        System.out.println("O saldo da sua conta é R$ 0,00");
    }

    @Override
    public void fazPix() {
        System.out.println("Serviço indisponível no momento");
    }
}
