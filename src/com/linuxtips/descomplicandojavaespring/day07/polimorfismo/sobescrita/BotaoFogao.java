package com.linuxtips.descomplicandojavaespring.day07.polimorfismo.sobescrita;

public class BotaoFogao extends Botao{

    @Override
    public void ligar() {
        /*super.ligar();*/
        System.out.println("Fogo ligado!");
    }

    @Override
    public void desligar() {
        super.desligar();
    }
}
