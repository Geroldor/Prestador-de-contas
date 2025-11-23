package com.avaliacao.trab1.models;

import java.time.LocalDate;

public class avaliacao {
    private int id;
    private LocalDate dataLancamento;
    private String diaReferencia;
    private float valor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getDiaReferencia() {
        return diaReferencia;
    }

    public void setDiaReferencia(String diaReferencia) {
        this.diaReferencia = diaReferencia;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
