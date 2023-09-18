package com.linuxtips.descomplicandojavaespring.day07.heranca;

public class PessoaDesenvolvedoraBackEnd extends PessoaDesenvolvedora{
    public PessoaDesenvolvedoraBackEnd(String nome, Double salario, String stack) {
        super(nome, salario, stack);
    }

    @Override
    public void codar() {
        super.codar();
    }
}
