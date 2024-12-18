package com.ctseducare.java.j02_construtor_sobrecarga;

public class Testar {

    public static void main(String[] args) {

        var aluno1 = new Aluno();
        aluno1.nome = "Fulano da Silva";
        if (aluno1.ativo) {
            System.out.println("O aluno %s esta ativo".formatted(aluno1.nome));
        } else {
            System.out.println("O aluno %s não esta ativo".formatted(aluno1.nome));
        }

        var aluno2 = new Aluno("Beltrano Gomes");
        if (aluno2.ativo) {
            System.out.println("O aluno %s esta ativo".formatted(aluno2.nome));
        } else {
            System.out.println("O aluno %s não esta ativo".formatted(aluno2.nome));
        }

    }

}
