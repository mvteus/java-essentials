package com.linuxtips.descomplicandojavaespring.day06.encapsulamento;

public class Dog {

    /* Private: Atributos privados com acesso apenas dentro desta classe */
    private Double peso;
    private Integer idade;


    /* Public: Atributos públicos com acesso no projeto inteiro */
    public Double pesoPublico;
    public Integer idadePublica;


    /* Protected: Atributos protegidos com acesso apenas pelo pacote */
    protected Double pesoProtegido;
    protected Integer idadeProtegida;

    /* Métodos com diferentes modificadores de acesso para exemplificar */

    /* Método público */
    public String latir() {
        return "auau";
    }

    /* Método protegido */
    protected String dormir() {
        return "Zzzz...";
    }

    /* Método privado */
    private String comer() {
        return "Ração";
    }

}
