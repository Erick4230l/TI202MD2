package Tema4_Ordenamiento;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuickSort {

    private static final int NUM_ELEMENTOS = 1_000_000;

    public static void main(String[] args) {

        List<Integer> datos = new ArrayList<>(NUM_ELEMENTOS);

        System.out.println("Generando datos...");
        generarDatosAleatorios(datos);
        System.out.println("Datos generados: " + datos.size());

        // Instanciamos la clase que tiene la lógica (TestQuickSort)
        TestQuickSort sorter = new TestQuickSort();

        long inicio = System.currentTimeMillis();

        System.out.println("Ordenando con QuickSort...");
        // Llamada al método de la clase TestQuickSort
        sorter.ordenar(datos);

        long fin = System.currentTimeMillis();
        double tiempoTotal = (fin - inicio) / 1000.0;

        System.out.println("Ordenamiento finalizado.");
        System.out.println("Tiempo total: " + tiempoTotal + " segundos.");
    }

    private static void generarDatosAleatorios(List<Integer> lista) {
        Random random = new Random();
        for (int i = 0; i < NUM_ELEMENTOS; i++) {
            lista.add(random.nextInt(NUM_ELEMENTOS * 10));
        }
    }
}

// --- CLASE TEST (Lógica del algoritmo) ---
// Puedes tener esta clase en el mismo archivo (sin 'public') o en un archivo aparte llamado TestQuickSort.java

class TestQuickSort {

    // Método público que llama el main
    public void ordenar(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) {
            return;
        }
        quickSortRecursivo(lista, 0, lista.size() - 1);
    }

    // Lógica recursiva principal
    private void quickSortRecursivo(List<Integer> lista, int bajo, int alto) {
        if (bajo < alto) {
            int pi = partition(lista, bajo, alto);

            quickSortRecursivo(lista, bajo, pi - 1);
            quickSortRecursivo(lista, pi + 1, alto);
        }
    }

    // Método para dividir la lista (Partition)
    private int partition(List<Integer> lista, int bajo, int alto) {
        int pivot = lista.get(alto);
        int i = (bajo - 1);

        for (int j = bajo; j < alto; j++) {
            if (lista.get(j) < pivot) {
                i++;
                swap(lista, i, j);
            }
        }
        swap(lista, i + 1, alto);
        return i + 1;
    }

    // Método auxiliar para intercambiar valores
    private void swap(List<Integer> lista, int i, int j) {
        int temp = lista.get(i);
        lista.set(i, lista.get(j));
        lista.set(j, temp);
    }
}