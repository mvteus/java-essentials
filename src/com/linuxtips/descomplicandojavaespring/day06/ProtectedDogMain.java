package com.linuxtips.descomplicandojavaespring.day06;

import com.linuxtips.descomplicandojavaespring.day06.encapsulamento.Dog;

public class ProtectedDogMain {

    public static void main(String[] args) {
        Dog pastorAlemao = new Dog();

        System.out.println(pastorAlemao.latir());
    }
}
