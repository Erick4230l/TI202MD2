package Tema3_EstructurasNoLineales.Tarea2;

public class Postorder {

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

        Postorder arbol = new Postorder(raiz);

        arbol.postorder(raiz);
    }
    private Node raiz;

    public Postorder(Node raiz) {
        this.raiz = raiz;
    }

    public void postorder(Node p) {
        if (p == null) {
            return;

        } else {

            for (Node hijo : p.getChilds()) {
                postorder(hijo);

            }
            System.out.print(p.getValue() + " ");

        }
    }
}
