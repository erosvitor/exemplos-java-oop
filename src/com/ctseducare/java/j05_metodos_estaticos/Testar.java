package com.ctseducare.java.j05_metodos_estaticos;

public class Testar {

    public static void main(String[] args) {
        
        var areaQuadrado = AreasFiguras.calcularAreaQuadrado(20);
        var areaTriangulo = AreasFiguras.calcularAreaTriangulo(10, 5);
        
        System.out.println("Área de um quadro de lado 20 é: %.2f".formatted(areaQuadrado));
        System.out.println("Área de um triângulo de base 10 e altura 5 é: %.2f".formatted(areaTriangulo));

    }

}
