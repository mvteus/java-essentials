package com.linuxtips.descomplicandojavaespring.day07.heranca;

public class PessoaDesenvolvedora {

    private String nome;
    private Double salario;
    private String stack;

    /* Construtor, para que possamos referenciar esta classe e termos os mesmos atributos que ela */
    public PessoaDesenvolvedora(String nome, Double salario, String stack) {
        this.nome = nome;
        this.salario = salario;
        this.stack = stack;
    }

    /* Como os atributos são privados, é necessários criar Getters & Setters para obter e definir os atribuos
     * de fora, no caso, das classes (sub) que herdarão desta classe (super) */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public void codar() {
        System.out.println("Let's code!");
    }
}