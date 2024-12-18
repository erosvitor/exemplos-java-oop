package com.ctseducare.java.j07_lista_objetos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaStrings {

    public static void main(String[] args) {
      // Criando uma lista vazia para strings
      List<String> peixes = new ArrayList<>();

      // Adicionando valores
      peixes.add("Robalo");
      peixes.add("Corvina");
      peixes.add("Bagre");
      peixes.add("Salmão");
      peixes.add("Tilápia");

      // Removendo valor
      peixes.remove("Corvina");

      // Listando conteúdo - método 1
      for (var i=0; i < peixes.size(); i++) {
        System.out.println(peixes.get(i));
      }
      System.out.println();

      // Listando conteúdo - método 2
      for (String peixe : peixes) {
        System.out.println(peixe);
      }
      System.out.println();

      // Listando conteúdo - método 3
      peixes.forEach(peixe -> System.out.println(peixe));  // JAVA 1.8
      System.out.println();

      // Ordenando ascendente
      Collections.sort(peixes);
      peixes.forEach(peixe -> System.out.println(peixe));
      System.out.println();

      // Ordenando descendente
      Collections.reverse(peixes);
      peixes.forEach(peixe -> System.out.println(peixe));
      System.out.println();
    }

  }
