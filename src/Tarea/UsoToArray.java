/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea;

/**
 *
 * @author erick
 */
// Fig. 16.4: UsoToArray.java
// Ver arreglos como objetos List y convertir objetos List en arreglos.
import java.util.LinkedList;
import java.util.Arrays;

public class UsoToArray
{
    // el constructor crea un objeto LinkedList, le agrega elementos y lo
    // convierte en arreglo
    public static void main(String[] args)
    {
        System.out.println("Nombre: Ramirez Ceron Erick Daniel");
        String[] colores = { "negro", "azul", "amarillo" };
        LinkedList<String> enlaces = new LinkedList<>(Arrays.asList(colores));

        enlaces.addLast("rojo"); // lo agrega como el último elemento
        enlaces.add("rosa"); // lo agrega al final
        enlaces.add(3, "verde"); // lo agrega en el índice 3
        enlaces.addFirst("cyan"); // lo agrega como el primer elemento

        // obtiene los elementos de LinkedList como un arreglo
        colores = enlaces.toArray(new String[enlaces.size()]);

        System.out.println("colores: ");

        for (String color : colores)
            System.out.println(color);
    } // fin de main
} // fin de la clase UsoToArray
