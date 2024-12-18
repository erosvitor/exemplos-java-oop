package com.ctseducare.java.j04_encapsulamento;

public class Livro {

    private String titulo;
    private short anoLancamento;

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public short getAnoLancamento() {
        return this.anoLancamento;
    }

    public void setAnoLancamento(short anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

}
