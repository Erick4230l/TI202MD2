/*
*ITESS-TICS 2025 Estructura y Organización de Datos
*Periodo: Agosto Diciembre 2025
*Docente: Francisco Javier Montecillo Puente
*Descripción: Creando una biblioteca
*Programador: EDRC
*Email: erickdaniel4230l@gmail.com
*Fecha: 8/octubre/2025
*Compile and run
*NumeroOpt.java
*/
package UNIDAD1.PROGLINEAL;

/**
 *
 * @author erick
 */
public class NumeroOpt {
    private double[]arreglo;
    
    public NumeroOpt(double[] arreglo) {
        this.arreglo = arreglo;
    }
    public int resolver(){
        // inicializar el valor minimo al elemento 0
        double min = arreglo[0];
        int idx = 0;
        // recorrer el arreglo
        for(int i = 1; i < arreglo.length; i++){
        // comparar con le vlaotr mas pequeño e intercambiar
            if ( arreglo[i] < min){
                min = arreglo[i];
                idx = i;
            }
        }
        // si le valor es negativo regresalo
        if(min < 0){
            return idx;   
        }
        // regresar -1
        return -1;
    }
    public void print(){
                for(int i = 0; i <= arreglo.length; i++){
                    System.out.println(arreglo[i]+"");
                }
                System.out.println("");  
    }
    
    
}
