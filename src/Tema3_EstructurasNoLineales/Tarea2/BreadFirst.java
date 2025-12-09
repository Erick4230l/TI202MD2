package Tema3_EstructurasNoLineales.Tarea2;

import java.util.LinkedList;
import java.util.Queue;

public class BreadFirst {

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

        BreadFirst arbol = new BreadFirst(raiz);
        arbol.breadFirst();
    }
    private Node raiz;

    public BreadFirst(Node raiz) {
        this.raiz = raiz;
    }

    public void breadFirst() {
        Queue<Node> Q = new LinkedList<>();

        Q.add(raiz);
        while (!Q.isEmpty()) {
            Node p = Q.poll();
            System.out.print(p.getValue() + " ");

        
        for (Node c: p.getChilds()){
            Q.add(c);
        }

    }
}
}
