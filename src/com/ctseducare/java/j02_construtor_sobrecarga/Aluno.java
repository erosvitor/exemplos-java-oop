package com.ctseducare.java.j02_construtor_sobrecarga;

public class Aluno {

    public String nome;
    public boolean ativo;

    public Aluno() {
        this.ativo = true;
    }

    public Aluno(String nome) {
        this.nome = nome;
        this.ativo = true;
    }

}
