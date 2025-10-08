/*
 *ITESS-TICS 2025 Estructura y Organización de Datos
*Periodo: Agosto Diciembre 2025
*Docente: Francisco Javier Montecillo Puente
*Descripción: Creando una biblioteca
*Programador: EDRC
*Email: erickdaniel4230l@gmail.com
*Fecha: 8/octubre/2025
*Compile and run
*GaussRTest.java
 */
package UNIDAD1.PROGLINEAL;

import java.text.DecimalFormat;

/**
 *
 * @author erick
 */
public class GaussRTest {
   public static void main(String[] args) {
        System.out.println("--- Prueba para GaussR ---");

        // Datos de entrada del ejemplo del manual
        int R_pivote = 3;
        int C_pivote = 1;

        double[][] matrizEntrada = {
            { 1.0, -60.0, -30.0, -20.0, 0.0, 0.0, 0.0, 0.0,    0.0 },
            { 0.0,   8.0,   6.0,   1.0, 1.0, 0.0, 0.0, 0.0,   48.0 },
            { 0.0,   4.0,   2.0,   1.5, 0.0, 1.0, 0.0, 0.0,   20.0 },
            { 0.0,   2.0,   1.5,   0.5, 0.0, 0.0, 1.0, 0.0,    8.0 },
            { 0.0,   0.0,   1.0,   0.0, 0.0, 0.0, 0.0, 1.0,    5.0 }
        };

        System.out.println("\n   Matriz de Entrada    ");
        printMatrix(matrizEntrada);

        // 1. Crear la instancia de GaussR
        GaussR gauss = new GaussR(R_pivote, C_pivote, matrizEntrada);

        // 2. Ejecutar el método de pivoteo
        gauss.pivote();
        
        // 3. Imprimir el resultado
        System.out.println("\n   Matriz de Salida (después del pivoteo)   ");
        printMatrix(matrizEntrada);
    }

    /**
     * Método auxiliar para imprimir la matriz de forma ordenada.
     */
    public static void printMatrix(double[][] matrix) {
         DecimalFormat df = new DecimalFormat("0.0000");
    for (double[] row : matrix) {
        for (double value : row) {
            if (value == 0.0) { 
                System.out.print(String.format("%11s", "0"));
            } else {
                System.out.print(String.format("%11s", df.format(value)));
            }
        }
        System.out.println();
    }
    }
}

