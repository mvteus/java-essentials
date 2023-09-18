package com.linuxtips.descomplicandojavaespring.day07.polimorfismo.sobescrita;

public class Televisao extends Botao{
    @Override
    public void ligar() {
        /*super.ligar();*/
        System.out.println("TV ligada!");
    }

    @Override
    public void desligar() {
        /*super.desligar();*/
        System.out.println("TV desligada!");
    }
}
