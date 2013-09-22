package problems.java;

import utils.java.Node;

/**
 * Created with IntelliJ IDEA.
 * User: Balaji Athreya
 * Date: 9/20/13
 * Time: 10:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class LeftChildRightSiblingTreeProblem {

    public static void main(String[] args){
        Node root = buildTree();
        Node re = convert(root);
        System.out.println(re);
    }

    public static Node convert(Node node){
        if(node == null || (node.getLeft() == null && node.getRight() == null)) return node;
        convert(node.getLeft());
        convert(node.getRight());
        if(node.getLeft() != null)
            node.getLeft().setRight(node.getRight());
        else
            node.setLeft(node.getRight());
        node.setRight(null);
        return node;
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

        return root;

    }
}
