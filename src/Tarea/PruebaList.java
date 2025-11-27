/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea;

/**
 *
 * @author erick
 */
// Fig. 16.3: PruebaList.java
// Uso de objetos List, LinkedList y ListIterator.
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class PruebaList
{
    public static void main(String[] args)
    {
        System.out.println("Nombre: Ramirez Ceron Erick Daniel");
        // agrega elementos a colores1
        String[] colores = {"negro", "rojo", "blanco", "azul"};
        List<String> lista1 = new LinkedList<String>();

        for (String color : colores)
            lista1.add(color);

        // agrega elementos de colores2 a lista2
        String[] colores2 = {"verde", "amarillo", "azul", "gris", "plateado"};
        List<String> lista2 = new LinkedList<String>();

        for (String color : colores2)
            lista2.add(color);

        lista1.addAll(lista2); // concatena las listas
        lista2 = null; // libera los recursos
        imprimirLista(lista1); // imprime los elementos de lista1

        convertirCadenasAMayusculas(lista1); // convierte cadena a mayusculas
        imprimirLista(lista1); // imprime los elementos de lista1
        
        System.out.printf("%nEliminando elementos 4 a 6...%n");
eliminarElementos(lista1, 4, 7); // elimina los elementos 4 a 6 de la lista
imprimirLista(lista1); // imprime los elementos de la lista

System.out.printf("%nImprimiendo la lista en orden inverso%n");
imprimirListaInversa(lista1); // imprime la lista en orden inverso
    }
// imprime el contenido de la lista
private static void imprimirLista(List<String> lista)
{
    System.out.printf("%nlista:%n");
    
    for (String elemento : lista)
        System.out.printf("%s ", elemento);

    System.out.println();
}

// localiza los objetos String y los convierte a mayúsculas
private static void convertirCadenasAMayusculas(List<String> lista)
{
    ListIterator<String> iterador = lista.listIterator();

    while (iterador.hasNext())
    {
        String color = iterador.next(); // obtiene elemento
        iterador.set(color.toUpperCase()); // convierte a mayúsculas
    }
}

// obtiene sublista y la utiliza para eliminar los elementos de
// la lista
private static void eliminarElementos(List<String> lista,
    int inicio, int fin)
{
    lista.subList(inicio, fin).clear(); // elimina los elementos
}

// imprime la lista en orden inverso
private static void imprimirListaInversa(List<String> lista)
{
    ListIterator<String> iterador = lista.listIterator(lista.size());

    System.out.printf("%nLista inversa:%n");

    while (iterador.hasPrevious())
        System.out.printf("%s ", iterador.previous());
}

// fin de la clase PruebaLista
    }   

