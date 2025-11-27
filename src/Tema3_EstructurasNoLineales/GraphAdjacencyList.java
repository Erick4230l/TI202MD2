/*
*ITESS-TICS 2025 Estructura y Organización de Datos
*Periodo: Agosto Diciembre 2025
*Docente: Francisco Javier Montecillo Puente
*Tema 3 Estrucutras no lineales
*3.1 Recursividad
*Descripción: Recursividad
*Programador: EDRC
*Email: erickdaniel4230l@gmail.com
*Fecha: 26/Noviembre/2025
*Compile and run
*Recursividad ejemplos con arboles Adjacency List for a Tree
 */
package Tema3_EstructurasNoLineales;

import java.util.ArrayList;
import java.util.List;

public class GraphAdjacencyList {

    private List<List<Integer>> graph; // Lista de adjyacencia guarda un null si no tiene nada
    private int n; // numero de vertices

    public GraphAdjacencyList(int n) {
        this.n = n;

        graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);

    }

    public void print() {
        int node = 0;
        for (var al : graph) {
            System.out.print(node + ":");

            for (var i : al) {
                System.out.print(i + " ");
            }
            node++;
            System.out.println("");
        }
    }

    public int depth(int p) {
        if (p == 0) {
            return 0;
        } else {
            return 1 + depth(graph.get(p).get(0));

        }

    }

    public int preorder(int p) {
        if (graph.size() > 1) {
            return preorder(p);
        } else {
            return graph.get(p).get(0);
        }

    }
}
