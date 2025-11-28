/*
*ITESS-TICS 2025 Estructura y Organización de Datos
*Periodo: Agosto Diciembre 2025
*Docente: Francisco Javier Montecillo Puente
*Descripción: Creando una biblioteca
*Programador: EDRC
*Email: erickdaniel4230l@gmail.com
*Fecha: 8/octubre/2025
*Compile and run
*DivisionCrazyTest.java
*/
package UNIDAD1.PROGLINEAL;

import java.util.Arrays;

public class DivisionCrazyTest {
    public static void main(String[] args) {
             System.out.println(" Prueba para DivisionCrazy");

        double[] colSolucion = {48.0, 20.0, 8.0, 5.0};
        
        double[] colPivote = {8.0, 4.0, 2.0, 0.0};
        
        double[] div = new double[colSolucion.length];

        System.out.println("Columna Solución: " + Arrays.toString(colSolucion));
        System.out.println("Columna Pivote:   " + Arrays.toString(colPivote));

        DivisionCrazy dc = new DivisionCrazy(colSolucion, colPivote, div);
        
        int filaPivote = dc.resolver();

        System.out.println("Cocientes calculados: " + Arrays.toString(div));
        System.out.println("\nSalida esperada (índice de la fila pivote): 2");
        System.out.println("Salida obtenida: " + filaPivote);
        
        if (filaPivote == 2) {
            System.out.println(">> ¡Prueba Exitosa!");
        } else {
            System.out.println(">> ¡Prueba Fallida!");
        }
    }
}
      

