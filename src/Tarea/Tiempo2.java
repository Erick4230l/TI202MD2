/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea;

/**
 *
 * @author erick
 */public class Tiempo2 {
    private int hora;
    private int minuto;
    private int segundo;

    public Tiempo2(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int obtenerHora() {
        return hora;
    }

    public int obtenerMinuto() {
        return minuto;
    }

    public int obtenerSegundo() {
        return segundo;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}
