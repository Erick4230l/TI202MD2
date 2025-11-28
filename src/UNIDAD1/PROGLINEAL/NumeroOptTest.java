/*
 *ITESS-TICS 2025 Estructura y Organización de Datos
*Periodo: Agosto Diciembre 2025
*Docente: Francisco Javier Montecillo Puente
*Descripción: Creando una biblioteca
*Programador: EDRC
*Email: erickdaniel4230l@gmail.com
*Fecha: 8/octubre/2025
*Compile and run
*NumeroOptTest.java
 */
package UNIDAD1.PROGLINEAL;

import java.util.Arrays;

/**
 *
 * @author erick
 */
public class NumeroOptTest {
   public static void main(String[] args) {
        System.out.println("Prueba 1:");
        double[] entrada1 = {1,2,3,4,-8};
        NumeroOpt test1 = new NumeroOpt(entrada1);
        int salida1 = test1.resolver();
        System.out.println("Entrada: " + Arrays.toString(entrada1));
        System.out.println("Salida esperada: ");
        System.out.println("Salida obtenida: " + salida1);
   }    
}
        
    
    

