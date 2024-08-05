import com.sun.source.tree.Tree;

class Node{
    char key;
    Node left;
    Node right;
    Node(char key){
        this.key = key;
    }
}

public class TreeTraversal {
    Node root;
    void preodertraversale(Node n){
        if (n != null) {
            System.out.println(n.key + " ");
            preodertraversale(n.left);
            preodertraversale(n.right);
        }
    }

    void ineodertraversale(Node n){
        if (n != null) {

            preodertraversale(n.left);
            preodertraversale(n.right);
            System.out.println(n.key + " ");
        }
    }

    void postodertraversale(Node n){
        if (n != null) {

            preodertraversale(n.left);
            System.out.println(n.key + " ");
            preodertraversale(n.right);
        }
    }
}
class Traversal{
    public static void main(String[] args) {
        TreeTraversal t1 = new TreeTraversal();
        t1.root = new Node('A');
        t1.root.left = new Node('B');
        t1.root.right = new Node('C');
        t1.root.left.left = new Node('D');
        t1.root.left.right = new Node('E');
        t1.root.left.left.right = new Node('F');

        t1.preodertraversale(t1.root);
        System.out.println();
        t1.ineodertraversale(t1.root);
        System.out.println();
        t1.postodertraversale(t1.root);

    }
}
