/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema3_EstructurasNoLineales;

/**
 *
 * @author erick
 */
public class GraphAdjacencyListTest {
        public static void main(String[] args) {
            GraphAdjacencyList tree= new GraphAdjacencyList(7);
            
            tree.addEdge(0, 1);
            tree.addEdge(0, 2);
            tree.addEdge(1, 3);
            tree.addEdge(1, 4);
            tree.addEdge(2, 5);
            tree.addEdge(2, 6);
            
            tree.print();
            
            System.out.println("depth(5) :" + tree.depth(5));
            System.out.println("preorder(5) :"+ tree.preorder(1));
        }
        
        
    }

