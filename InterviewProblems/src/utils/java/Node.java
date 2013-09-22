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


}
