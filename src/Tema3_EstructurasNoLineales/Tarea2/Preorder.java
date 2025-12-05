package Tema3_EstructurasNoLineales.Tarea2;

public class Preorder {

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

        Preorder arbol = new Preorder(raiz);

        arbol.preorder();
    }
    private Node raiz;

    public Preorder(Node raiz) {
        this.raiz = raiz;
    }

    public void preorder() {
        if (raiz == null) {
            System.out.println("El árbol está vacío");
        } else {
            preorder(raiz);
        }
        System.out.println();
    }

    private void preorder(Node p) {
        if (p == null) {

        } else {

            System.out.print(p.getValue() + " ");

            for (Node hijo : p.getChilds()) {
                preorder(hijo);
            }
        }
    }
}
