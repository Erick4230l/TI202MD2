/*
 *ITESS-TICS 2025 Estructura y Organización de Datos
*Periodo: Agosto Diciembre 2025
*Docente: Francisco Javier Montecillo Puente
*Descripción: Creando una biblioteca
*Programador: EDRC
*Email: erickdaniel4230l@gmail.com
*Fecha: 8/octubre/2025
*Compile and run
*GaussR.java
 */
package UNIDAD1.PROGLINEAL;

/**
 *
 * @author erick
 */
public class GaussR {
     private int r;
    private int c;
    private double [][]pl;
    
    public GaussR(int r, int c, double[][] pl) {
        this.r = r;
        this.c = c;
        this.pl = pl;
    }
    
    public void pivote(){
    double pivote = pl[r][c];
        for (int j = 0; j < pl[r].length; j++) {
            pl[r][j]/= pivote;
            
        }
        int nFilas = pl.length;
        for (int i = 0; i < nFilas; i++) {
            if (i != r) { 
                double factor = pl[i][c];
                for (int j = 0; j < pl[r].length; j++) {
                    pl[i][j] -= factor * pl[r][j];
                }
            }
        }
        
    }
    public void print(){
        for (double[] fila : pl) {
        // Para cada valor en esa fila
        for (double valor : fila) {
            System.out.print(valor + "\t");
        }
        System.out.println();
    }
    }

}
