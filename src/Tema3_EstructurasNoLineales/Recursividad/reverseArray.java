/*
*ITESS-TICS 2025 Estructura y OrganizaciÃ³n de Datos
*Periodo: Agosto Diciembre 2025
*Docente: Francisco Javier Montecillo Puente
*Tema 3 Estrucutras no lineales
*3.1 Recursividad
*DescripciÃ³n:Tareas de Recursividad
*Programador: EDRC
*Email: erickdaniel4230l@gmail.com
*Fecha: 27/Noviembre/2025
*Compile and run
*Revertir los elementos de un arreglo
 */
package Tema3_EstructurasNoLineales.Recursividad;

public class reverseArray {

    public static void ReverseArray(int[] data, int low, int higth) {
        if (low < higth) {
            int temp = data[low];
            data[low] = data[higth];
            data[higth] = temp;
            ReverseArray(data, low + 1, higth - 1);

        }
    }
}
