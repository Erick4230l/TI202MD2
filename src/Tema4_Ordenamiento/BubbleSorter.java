package Tema4_Ordenamiento;

// Esta clase solo contiene la lógica para ordenar el arreglo.
public class BubbleSorter {

    @Override
    public int hashCode() {
        return super.hashCode(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    /**
     * Ordena el arreglo de enteros utilizando el algoritmo de burbuja.
     * Es ineficiente (O(n^2)) para un millón de elementos.
     * @param arr El arreglo de enteros a ordenar.
     */
    public void ordenar(int[] arr) {
        int n = arr.length;
        boolean huboIntercambio;

        // Itera para colocar el elemento más grande al final en cada pase
        for (int i = 0; i < n - 1; i++) {
            huboIntercambio = false;

            // Itera para comparar pares adyacentes y hacer los intercambios
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Llama al método auxiliar para el intercambio
                    intercambiar(arr, j, j + 1);
                    huboIntercambio = true;
                }
            }

            // Optimización: si no hubo intercambios, el arreglo ya está ordenado
            if (!huboIntercambio) {
                break;
            }
        }
    }

    /**
     * Método auxiliar para intercambiar dos elementos en el arreglo.
     */
    private void intercambiar(int[] arr, int indice1, int indice2) {
        int temp = arr[indice1];
        arr[indice1] = arr[indice2];
        arr[indice2] = temp;
    }
}
