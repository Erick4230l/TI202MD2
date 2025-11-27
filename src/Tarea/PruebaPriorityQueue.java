/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea;

/**
 *
 * @author erick
 */// Fig. 16.15: PruebaPriorityQueue.java
// Programa de prueba de la clase PriorityQueue.
import java.util.PriorityQueue;

public class PruebaPriorityQueue
{
    public static void main(String[] args)
    { System.out.println("Nombre: Ramirez CEron ERick Daniel");
        // cola con capacidad de 11
        PriorityQueue<Double> cola = new PriorityQueue<>();

        // inserta elementos en la cola
        cola.offer(3.2);
        cola.offer(9.8);
        cola.offer(5.4);

        System.out.print("Sondeando de cola: ");

        // muestra los elementos en la cola
        while (cola.size() > 0)
        {
            System.out.printf("%.1f ", cola.peek()); // ve el elemento superior
            cola.poll(); // elimina el elemento superior
        }
    }
} // fin de la clase PruebaPriorityQueue
