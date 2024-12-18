package com.ctseducare.java.j01_classes;

public class Carro {
    
    public String marca;
    public String modelo;
    public String cor;
    public float capacidadeTanque;
    public float kmPorLitro;

    public float calcularAutonomia() {
        return capacidadeTanque * kmPorLitro;
    }

    public float calcularCombustivel(float km) {
        return km / kmPorLitro;
    }
    
}