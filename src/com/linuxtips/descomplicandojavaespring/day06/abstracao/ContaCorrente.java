package com.linuxtips.descomplicandojavaespring.day06.abstracao;

public class ContaCorrente extends Conta {
    @Override
    public void consultaSaldo() {
        System.out.println("Seu saldo é R$ 10,00");
    }

    @Override
    public void fazPix() {
        System.out.println("Digite o valor que você deseja transferir");
    }
}
