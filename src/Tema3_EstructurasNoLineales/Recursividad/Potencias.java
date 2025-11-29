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

public class Potencias {

    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * power(x, n - 1);
        }
    }

    public static double badpower(double x, int n) {
        if (n == 0) {
            return 1;
        } else {
            double partial = power(x, n / 2);
            double result = partial * partial;
            if (n % 2 == 1) {
                result *= x;
            }
            return result;

        }
    }


}
