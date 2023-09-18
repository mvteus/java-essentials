package com.linuxtips.descomplicandojavaespring.day07.polimorfismo.sobescrita;

public class Main {
    public static void main(String[] args) {
        BotaoFogao fogao = new BotaoFogao();
        fogao.ligar();
        fogao.desligar();

        Televisao tv = new Televisao();
        tv.ligar();
        tv.desligar();
    }
}
