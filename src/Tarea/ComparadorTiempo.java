/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea;
// Fig. 16.8: ComparadorTiempo2.java
// Clase comparador personalizada que compara dos objetos Tiempo.
import java.util.Comparator;

public class ComparadorTiempo implements Comparator<Tiempo2> {

    @Override
    public int compare(Tiempo2 tiempo1, Tiempo2 tiempo2) {
        int diferenciaHora = tiempo1.obtenerHora() - tiempo2.obtenerHora();

        if (diferenciaHora != 0) // evalúa primero la hora
            return diferenciaHora;

        int diferenciaMinuto = tiempo1.obtenerMinuto() - tiempo2.obtenerMinuto();

        if (diferenciaMinuto != 0) // evalúa el minuto
            return diferenciaMinuto;

        int diferenciaSegundo = tiempo1.obtenerSegundo() - tiempo2.obtenerSegundo();

        return diferenciaSegundo; // evalúa el segundo
    } // fin del método compare
} // fin de la clase ComparadorTiempo2