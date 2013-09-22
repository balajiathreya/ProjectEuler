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
        Node root = Node.buildTree();
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


}
