package com.linuxtips.descomplicandojavaespring.day06.interfaces;

public class ContaPoupança implements Conta{
    @Override
    public void consultarSaldo() {
        System.out.println("Saldo: R$ 0,13");
    }

    @Override
    public void fazerPix() {
        System.out.println("Serviço indisponível no momento!");
    }
}
