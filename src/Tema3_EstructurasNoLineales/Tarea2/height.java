
package Tema3_EstructurasNoLineales.Tarea2;

public class height {
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

        height arbol = new height(raiz);
        System.out.println(arbol.height(raiz));
  
    }
    Node raiz;
     public height(Node raiz) {
    this.raiz = raiz;
     }
      public int height(Node nodo) {
          int h=0;
        for (Node c : nodo.getChilds()) {
           h= Math.max(h,1+ height(c));
        } return h;
          
      
    }
    
}

