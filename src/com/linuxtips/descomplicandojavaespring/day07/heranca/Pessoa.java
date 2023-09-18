package com.linuxtips.descomplicandojavaespring.day07.heranca;

public class Pessoa {
    public static void main(String[] args) {
        PessoaDesenvolvedoraBackEnd mateus = new PessoaDesenvolvedoraBackEnd("Mateus Souza da Silva", 3.400,"Java & Spring");
        mateus.codar();

        PessoaDesenvolvedoraFrontEnd gabriel = new PessoaDesenvolvedoraFrontEnd("Gabriel de Souza Silva", 3.400,"JavaScript & Angular");
        gabriel.codar();
    }
}
