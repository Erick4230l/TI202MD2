package Tema3_EstructurasNoLineales.Tarea2;

import java.util.List;

public class inorder {

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

        inorder arbol = new inorder(raiz);

        arbol.Inorder(raiz);
    }
    private Node raiz;

    public inorder(Node raiz) {
        this.raiz = raiz;
    }

    public void Inorder(Node p) {
        if (p == null)
        return;
        
       List<Node> hijos = p.getChilds(); 

        boolean Izquierda = hijos.size() > 0;
        boolean Derecha = hijos.size() > 1;

        if (Izquierda) {
            Inorder(hijos.get(0));
        }

        System.out.print(p.getValue() + " ");

        if (Derecha) {
            Inorder(hijos.get(1));
        }
    }
        }
    


