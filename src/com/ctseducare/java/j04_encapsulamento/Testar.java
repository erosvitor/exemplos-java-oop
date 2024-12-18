package com.ctseducare.java.j04_encapsulamento;

public class Testar {

    public static void main(String[] args) {
        var livro1 = new Livro();
        livro1.setTitulo("Java para iniciantes - 6 edição");
        livro1.setAnoLancamento((short) 2015);
        
        System.out.println(livro1.getTitulo());
        System.out.println(livro1.getAnoLancamento());
    }

}
