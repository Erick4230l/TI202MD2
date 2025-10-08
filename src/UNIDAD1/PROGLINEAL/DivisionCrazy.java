/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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



   
    
