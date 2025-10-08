/*
*ITESS-TICS 2025 Estructura y Organización de Datos
*Periodo: Agosto Diciembre 2025
*Docente: Francisco Javier Montecillo Puente
*Descripción: Creando una biblioteca
*Programador: EDRC
*Email: erickdaniel4230l@gmail.com
*Fecha: 8/octubre/2025
*Compile and run
*DivisionCrazy.java
 */
package UNIDAD1.PROGLINEAL;


public class DivisionCrazy {
     private double[]columna1;
     private double[]columna2;
     private double[]div;

    public DivisionCrazy(double[] columna1, double[] columna2, double[] div) {
        this.columna1 = columna1;
        this.columna2 = columna2;
        this.div=div;
    }
   
    public int resolver(){   
    // A partir del segundo elemnto dividir elemento de la segunda columna entre la primera
    for (int i=0; i<columna1.length;i++){
     if (columna2[i]>0){
         div[i]=columna1[i]/columna2[i];   
     }  
     else{
         div[i]=Double.MAX_VALUE;
     }
     
    }
    // Comparar cual es el positivo mas pequeño
    int Valorp = -1;
    double min=Double.MAX_VALUE;
        for (int i = 0; i < div.length; i++) {
            if (div[i]<min){
                min=div[i];
                Valorp=i;
            }
            
        }return Valorp;
    }

    }



   
    
