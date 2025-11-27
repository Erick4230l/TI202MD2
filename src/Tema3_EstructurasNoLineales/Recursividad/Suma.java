/*
*ITESS-TICS 2025 Estructura y Organización de Datos
*Periodo: Agosto Diciembre 2025
*Docente: Francisco Javier Montecillo Puente
*Tema 3 Estrucutras no lineales
*3.1 Recursividad
*Descripción:Tareas de Recursividad
*Programador: EDRC
*Email: erickdaniel4230l@gmail.com
*Fecha: 27/Noviembre/2025
*Compile and run
*Suma de nuemeros de un arreglo con recersividad 
 */
package Tema3_EstructurasNoLineales.Recursividad;

public class Suma {

    public static void main(String[] args) {
        int data[]={1,2,3};
        int n1= 3;
        int n2=2;
        int n3=1;
        
        System.out.println(LinearSum(data,n1));
        System.out.println(LinearSum(data,n2));
        System.out.println(LinearSum(data,n3));

    }

    public static int LinearSum(int[] data, int n) {
        if (n == 0) {
            return 0;
        } else {
            return LinearSum(data, n - 1) + data[n - 1];
        }
    }
}
