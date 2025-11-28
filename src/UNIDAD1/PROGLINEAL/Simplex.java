/**
  *ITESS-TICS 2025 Estructura y Organización de Datos
*Periodo: Agosto Diciembre 2025
*Docente: Francisco Javier Montecillo Puente
*Descripción: Creando una biblioteca
*Programador: EDRC
*Email: erickdaniel4230l@gmail.com
*Fecha: 8/octubre/2025
*Compile and run
*GaussRTest.java
*/
package UNIDAD1.PROGLINEAL;

import java.text.DecimalFormat;

/**
 *
 * @author erick
 */
public class Simplex {

    private double[][] pl;

    public Simplex(double[][] tablaInicial) {
        this.pl = tablaInicial;
    }

    public void resolver() {
        int iteracion = 1;

        while (true) {
            System.out.println("--- Iteración #" + iteracion + " ---");
            print();
            System.out.println();

            // Paso 1: Buscar columna pivote (mínimo negativo en función objetivo)
            double[] funcionObjetivo = pl[0];
            int cPivote = -1;
            double min = 0.0;
            for (int j = 0; j < funcionObjetivo.length - 1; j++) {
                if (funcionObjetivo[j] < min) {
                    min = funcionObjetivo[j];
                    cPivote = j;
                }
            }

            if (cPivote == -1) {
                System.out.println(" Solución óptima alcanzada");
                break;
            }

            // Buscar fila pivote (mínimo cociente positivo)
            int restricciones = pl.length - 1;
            int fPivote = -1;
            double minCociente = Double.MAX_VALUE;
            for (int i = 1; i <= restricciones; i++) {
                double valorPivote = pl[i][cPivote];
                double valorSolucion = pl[i][pl[0].length - 1];
                if (valorPivote > 0) {
                    double cociente = valorSolucion / valorPivote;
                    if (cociente < minCociente) {
                        minCociente = cociente;
                        fPivote = i;
                    }
                }
            }

            if (fPivote == -1) {
                System.out.println(" No hay fila pivote valida");
                break;
            }

            // Paso 3: Pivoteo
            double pivote = pl[fPivote][cPivote];
            for (int j = 0; j < pl[0].length; j++) {
                pl[fPivote][j] /= pivote;
            }

            for (int i = 0; i < pl.length; i++) {
                if (i != fPivote) {
                    double factor = pl[i][cPivote];
                    for (int j = 0; j < pl[0].length; j++) {
                        pl[i][j] -= factor * pl[fPivote][j];
                    }
                }
            }

            iteracion++;
        }

        System.out.println("--- Tabla final ---");
        print();
    }

    public void print() {
        DecimalFormat df = new DecimalFormat("0.0000");
        for (double[] fila : pl) {
            for (double valor : fila) {
                if (Math.abs(valor) < 1e-6) {
                    System.out.print(String.format("%11s", "0"));
                } else {
                    System.out.print(String.format("%11s", df.format(valor)));
                }
            }
            System.out.println();
        }
    }
}

