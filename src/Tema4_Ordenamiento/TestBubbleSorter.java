package Tema4_Ordenamiento;

import java.util.Random;

// Esta clase contiene el método main y gestiona la ejecución.
public class TestBubbleSorter{

    // Número de elementos a ordenar: 1,000,000
    private static final int NUM_ELEMENTOS = 1000000;

    public static void main(String[] args) {
        String a="erick";
        System.out.println(a.hashCode());
        // 1. Crear el arreglo de 1,000,000 de enteros
        int[] datos = new int[NUM_ELEMENTOS];

        // 2. Generar datos aleatorios
        System.out.println("Generando " + NUM_ELEMENTOS + " datos aleatorios...");
        generarDatosAleatorios(datos);
        System.out.println("Generación de datos finalizada.");

        // 3. Instanciar la clase que contiene la lógica del algoritmo de burbuja
        BubbleSorter sorter = new BubbleSorter();

        // 4. Medir el tiempo de ordenamiento
        long tiempoInicio = System.currentTimeMillis();
        
        // 5. Ordenar los datos llamando al método de la otra clase
        System.out.println("Iniciando ordenamiento de burbuja...");
        sorter.ordenar(datos);
        
        long tiempoFin = System.currentTimeMillis();
        long tiempoTotal = tiempoFin - tiempoInicio;

        // 6. Imprimir el resultado del tiempo
        System.out.println("Ordenamiento finalizado.");
        System.out.println("Tiempo total de ejecución: " + (tiempoTotal / 1000.0) + " segundos.");
    }

    /**
     * Llena el arreglo con números enteros aleatorios.
     */
    private static void generarDatosAleatorios(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            // Se usa NUM_ELEMENTOS como límite para generar números entre 0 y 999,999
            arr[i] = random.nextInt(NUM_ELEMENTOS); 
        }
    }
}