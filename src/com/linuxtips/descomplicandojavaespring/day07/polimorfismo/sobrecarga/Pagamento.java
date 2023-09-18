package com.linuxtips.descomplicandojavaespring.day07.polimorfismo.sobrecarga;

public class Pagamento {

    /* Exemplo de sobrecarga */

    /* Pagamento à vista */
    public Double pagamento(Double valor) {
        return valor;
    }

    /* Calcula o valor das parcelas */
    public Integer pagamento(Integer valor, Integer parcelas) {
        return valor / parcelas;
    }

    /* Juros */
    public Long pagamento(Integer valor, Integer parcela, Long juros) {
        return (valor / parcela) + juros;
    }
}
