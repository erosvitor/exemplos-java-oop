package com.ctseducare.java.j06_heranca;

public class Testar {

    public static void main(String[] args) {
        
        var pf = new PessoaFisica();
        pf.setNome("Fulano da Silva");
        pf.setCpf("304.349.920-46");
        System.out.println("%s, %s".formatted(pf.getNome(), pf.getCpf()));

        var pj = new PessoaJuridica();
        pj.setNome("Empresa XYZ Ltda");
        pj.setCnpj("93.064.305/0001-48");
        System.out.println("%s, %s".formatted(pj.getNome(), pj.getCnpj()));

    }

}
