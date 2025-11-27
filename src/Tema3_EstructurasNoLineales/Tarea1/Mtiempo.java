/*
*ITESS-TICS 2025 Estructura y Organización de Datos
*Periodo: Agosto Diciembre 2025
*Docente: Francisco Javier Montecillo Puente
*Tema 3 Estrucutras no lineales
*3.1 Recursividad
*Descripción: Recursividad
*Programador: EDRC
*Email: erickdaniel4230l@gmail.com
*Fecha: 27/Noviembre/2025
*Compile and run
*Medir tiempo de ejecucuion en java
 */
package Tema3_EstructurasNoLineales.Tarea1;

public class Mtiempo {

    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println("resultado de la potencia "+ pot(2, 30));
        long end = System.nanoTime();

        System.out.println("tiempo de ejecucion en nano-segundos: " + (end - start));
    }

    public static int pot(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * pot(x, n - 1);
        }
    }

}
