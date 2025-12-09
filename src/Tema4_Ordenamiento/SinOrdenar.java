/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema4_Ordenamiento;
  import java.util.Random;
public class SinOrdenar {

    public static void main(String[] args) {
        // 1. Crear el arreglo de 1 millón de enteros
        int n = 1_000_000;
        int[] arreglo = new int[n];
        
        // 2. Llenar con datos aleatorios (simulando desorden)
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arreglo[i] = random.nextInt(n * 10); 
        }

        // 3. Definir el target (objetivo)
        // Para asegurar que lo encuentre en la prueba, insertamos uno manualmente
        int target = 77777;
        int posicionReal = 543210; // Posición arbitraria para prueba
        arreglo[posicionReal] = target;

        System.out.println("Buscando el número " + target + " en 1,000,000 de datos...");

        // 4. Llamada al algoritmo
        long inicio = System.nanoTime();
        int indice = buscar(arreglo, target);
        long fin = System.nanoTime();

        // 5. Resultado
        if (indice != -1) {
            System.out.println("Encontrado en el índice: " + indice);
        } else {
            System.out.println("El número no está en el arreglo.");
        }
        
        System.out.println("Tiempo total: " + (fin - inicio) + " nanosegundos");
    }

    // ALGORITMO SOLICITADO
    // Busca elemento por elemento (O(n))
    public static int buscar(int[] datos, int target) {
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] == target) {
                return i; // Retorna la posición apenas lo encuentra
            }
        }
        return -1; // Retorna -1 si recorrió todo sin éxito
    }
}

