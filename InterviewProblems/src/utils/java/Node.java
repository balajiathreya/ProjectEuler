package utils.java;

/**
 * Created with IntelliJ IDEA.
 * User: Balaji Athreya
 * Date: 9/21/13
 * Time: 7:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class Node {
    private int value;
    private Node left = null;
    private Node right = null;

    public Node(int v){
        value = v;
    }

    public String toString(){
        return ""+value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public static Node buildTree(){
        Node root = new Node(1);
        Node left = new Node(2);
        Node right = new Node(3);
        root.setLeft(left);
        root.setRight(right);

        Node left1 = new Node(4);
        Node left2 = new Node(5);
        left.setLeft(left1);
        left.setRight(left2);

        Node right1 = new Node(6);
        Node right2 = new Node(7);
        right.setLeft(right1);
        right.setRight(right2);

        Node rigth22 = new Node(8);
        right1.setLeft(rigth22);

        return root;

    }


}
