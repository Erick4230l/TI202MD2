/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea;

/**
 *
 * @author erick
 */
// Fig. 16.9: Ordenamiento3.java
// Método sort de Collections con una clase Comparator personalizada.
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Ordenamiento3 {
    public static void main(String[] args) {
        System.out.println("Nombre : Ramirez Ceron Erick Daniel");
        List<Tiempo2> lista = new ArrayList<>(); // crea objeto List

        lista.add(new Tiempo2(6, 24, 34));
        lista.add(new Tiempo2(18, 14, 58));
        lista.add(new Tiempo2(6, 05, 34));
        lista.add(new Tiempo2(6, 24, 22));
        lista.add(new Tiempo2(6, 24, 34));

        // imprime los elementos del objeto List
        System.out.printf("Elementos del arreglo desordenados:%n%s%n", lista);

        // ordena usando un comparador
        Collections.sort(lista, new ComparadorTiempo());

        // imprime los elementos del objeto List
        System.out.printf("Elementos de la lista ordenados:%n%s%n", lista);
    }
} // fin de la clase Ordenamiento3