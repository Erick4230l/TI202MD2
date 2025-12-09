/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema4_Ordenamiento;

import java.util.Arrays;
import java.util.Random;

public class BusquedaBInaria {

    public static void main(String[] args) {
        int n = 1_000_000;
        int[] arreglo = new int[n];
        Random random = new Random();

        // 1. Llenar el arreglo (Desordenado al inicio)
        System.out.println("Generando " + n + " datos...");
        for (int i = 0; i < n; i++) {
            arreglo[i] = random.nextInt(n * 10);
        }

        // Definimos un target que seguro existe para la prueba (antes de ordenar)
        int target = 99999;
        arreglo[500] = target; // Lo forzamos en una posición aleatoria

        // 2. ORDENAR EL ARREGLO
        // Usamos Arrays.sort() que implementa Dual-Pivot Quicksort
        // Complejidad: O(n log n)
        System.out.println("Ordenando el arreglo... (esto tomará un momento)");
        long inicioSort = System.currentTimeMillis();
        Arrays.sort(arreglo);
        long finSort = System.currentTimeMillis();
        System.out.println("Tiempo de ordenado: " + (finSort - inicioSort) + " ms");

        // 3. BÚSQUEDA BINARIA
        // Ahora que está ordenado, podemos dividir y vencer.
        System.out.println("Buscando el objetivo: " + target);

        long inicioBusqueda = System.nanoTime();
        int indice = busquedaBinaria(arreglo, target);
        long finBusqueda = System.nanoTime();

        if (indice != -1) {
            System.out.println(" Encontrado en el índice: " + indice);
        } else {
            System.out.println(" No encontrado.");
        }

        System.out.println("Tiempo de búsqueda: " + (finBusqueda - inicioBusqueda) + " nanosegundos");
    }

    /**
     * Implementación manual de Binary Search Complejidad: O(log n)
     */
    public static int busquedaBinaria(int[] datos, int target) {
        int inicio = 0;
        int fin = datos.length - 1;

        while (inicio <= fin) {
            // Calcular el punto medio
            int medio = inicio + (fin - inicio) / 2;

            if (datos[medio] == target) {
                return medio; // ¡Encontrado!
            }

            if (datos[medio] < target) {
                // Si el dato del medio es menor, buscamos en la mitad derecha
                inicio = medio + 1;
            } else {
                // Si el dato del medio es mayor, buscamos en la mitad izquierda
                fin = medio - 1;
            }
        }
        return -1; // No encontrado
    }
}
