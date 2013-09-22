package utils.java;

/**
 * Created with IntelliJ IDEA.
 * User: Balaji Athreya
 * Date: 9/21/13
 * Time: 8:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class Node1 {
    private int value;
    private Node1 left = null;
    private Node1 right = null;

    private Node1 parent = null;

    public Node1(int v){
        value = v;
    }

    public String toString(){
        return ""+value;
    }

    public Node1 getLeft() {
        return left;
    }

    public void setLeft(Node1 left) {
        this.left = left;
    }

    public Node1 getRight() {
        return right;
    }

    public void setRight(Node1 right) {
        this.right = right;
    }

    public Node1 getParent() {
        return parent;
    }

    public void setParent(Node1 parent) {
        this.parent = parent;
    }



    public static Node1 buildTree(){
        Node1 root = new Node1(1);
        Node1 left = new Node1(2);
        Node1 right = new Node1(3);
        root.setLeft(left);
        root.setRight(right);
        left.setParent(root);
        right.setParent(root);

        Node1 left1 = new Node1(4);
        Node1 left2 = new Node1(5);
        left.setLeft(left1);
        left.setRight(left2);
        left1.setParent(left);
        left2.setParent(left);

        Node1 right1 = new Node1(6);
        Node1 right2 = new Node1(7);
        right.setLeft(right1);
        right.setRight(right2);
        right1.setParent(right);
        right2.setParent(right);

        return root;

    }

}
