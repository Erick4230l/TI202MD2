/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema3_EstructurasNoLineales.Tarea2;

import java.util.ArrayList;
import java.util.List;

public class heightBad {

    public static void main(String[] args) {

        Node raiz = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        raiz.addChild(n1);
        raiz.addChild(n2);

        n1.addChild(n3);
        n1.addChild(n4);

        n2.addChild(n5);

        heightBad arbol = new heightBad(raiz);
        System.out.println(arbol.heightBad());
    }

    public heightBad(Node raiz) {
        this.raiz = raiz;
    }

    private Node raiz;

    public int heightBad() {
        int h = 0;
        for (Node p : positions()) { 
            
            if (isExternal(p)) { 
                h = Math.max(h, depth(p)); 
            }
        }
        return h;
    }
    public int depth(Node nodo) {
        if (nodo.getParent() == null) {
            return 0;
        } else {
            return 1 + depth(nodo.getParent());
        }
    }
                

    private List<Node> positions() {
        List<Node> lista = new ArrayList<>();
        agregarNodo(raiz, lista);
        return lista;
    }
   private boolean isExternal(Node p) {
        return p.getChilds().isEmpty();
    }
    private void agregarNodo(Node nodo, List<Node> lista) {
        lista.add(nodo);
        
        for (Node hijo : nodo.getChilds()) {
            agregarNodo(hijo, lista);
        }
    }

}