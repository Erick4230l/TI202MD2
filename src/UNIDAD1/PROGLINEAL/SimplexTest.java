/*
 *ITESS-TICS 2025 Estructura y Organización de Datos
*Periodo: Agosto Diciembre 2025
*Docente: Francisco Javier Montecillo Puente
*Descripción: Creando una biblioteca
*Programador: EDRC
*Email: erickdaniel4230l@gmail.com
*Fecha: 8/octubre/2025
*Compile and run
*SimplexTestt.java
 */
package UNIDAD1.PROGLINEAL;

/**
 *
 * @author erick
 */
public class SimplexTest {
    public static void main(String[] args)  {
        double[][] tablaInicial = {
            { 1.0, -60.0, -30.0, -20.0, 0.0, 0.0, 0.0, 0.0,    0.0 },
            { 0.0,   8.0,   6.0,   1.0, 1.0, 0.0, 0.0, 0.0,   48.0 },
            { 0.0,   4.0,   2.0,   1.5, 0.0, 1.0, 0.0, 0.0,   20.0 },
            { 0.0,   2.0,   1.5,   0.5, 0.0, 0.0, 1.0, 0.0,    8.0 },
            { 0.0,   0.0,   1.0,   0.0, 0.0, 0.0, 0.0, 1.0,    5.0 }
        };

        Simplex simplex = new Simplex(tablaInicial);
        simplex.resolver();
    }
}


