package com.ctseducare.java.j01_classes;

public class Testar {

    public static void main(String[] args) {
        
        var carro1 = new Carro();
        carro1.marca = "Ford";
        carro1.modelo = "Fusion";
        carro1.cor = "Preta";
        carro1.capacidadeTanque = 55;
        carro1.kmPorLitro = 8;

        var autonomia = carro1.calcularAutonomia();
        //System.out.println("Autonomia do carro " + carro1.modelo + " é de " + autonomia);
        System.out.println("Autonomia do carro %s é de %.2f".formatted(carro1.modelo, autonomia));  // JAVA 15

        var quilometragem = 400;
        var qtdeCombustivel = carro1.calcularCombustivel(quilometragem);
        //System.out.println("Para uma viagem de " + quilometragem + "km, são necessários " + qtdeCombustivel + " litros de combustível");
        System.out.println("Para uma viagem de %skm, são necessários %.2f litros de combustível".formatted(quilometragem, qtdeCombustivel));  // JAVA 15
        
    }

}
