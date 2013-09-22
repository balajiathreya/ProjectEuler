package problems.java;

import utils.java.Node1;

/**
 * Created with IntelliJ IDEA.
 * User: Balaji Athreya
 * Date: 9/21/13
 * Time: 7:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class InvertBinaryTreeByLeafProblem {

    public static void main(String[] args){
        Node1 root = Node1.buildTree();
        invertBinaryTreeByLeaf(root, root.getLeft().getRight());
        System.out.println(root);

    }

    public static Node1 invertBinaryTreeByLeaf(Node1 node, Node1 newRoot) {

        if (node == null)   return null;
        if (node == newRoot) {
            node.setLeft(node.getParent());
            node.setParent(null);
            return node;
        }
        if (invertBinaryTreeByLeaf(node.getLeft(), newRoot) != null) {
            Node1 oldParent = node.getParent();
            node.setParent(node.getLeft());
            node.setLeft(oldParent);
            return node;
        }
        if (invertBinaryTreeByLeaf(node.getRight(), newRoot) != null) {
            Node1 oldParent = node.getParent();
            node.setParent(node.getRight());
            node.setRight(oldParent);
            return node;
        }

        return null;
    }
}
