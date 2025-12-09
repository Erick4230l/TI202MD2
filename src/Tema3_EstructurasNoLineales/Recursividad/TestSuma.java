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

import static Tema3_EstructurasNoLineales.Recursividad.Suma.LinearSum;

public class TestSuma {
    public static void main(String[] args) {
        int data[]={1,2,3};
        System.out.println(LinearSum(data,3));
        System.out.println(LinearSum(data,2));
        System.out.println(LinearSum(data,1));
           
}
}
