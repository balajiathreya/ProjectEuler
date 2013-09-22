/**
 * Created with IntelliJ IDEA.
 * User: Balaji Athreya
 * Date: 9/20/13
 * Time: 10:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class LeftChildRightSiblingTreeProblem {

    static class Node{
        private int value;
        private Node left = null;
        private Node right = null;

        Node(int v){
            value = v;
        }

        public String toString(){
            return ""+value;
        }
    }

    public static void main(String[] args){
        Node root = buildTree();
        Node re = convert(root);
        System.out.println(re);
    }

    public static Node convert(Node node){
        if(node == null || (node.left == null && node.right == null)) return node;
        convert(node.left);
        convert(node.right);
        if(node.left != null)
            node.left.right = node.right;
        else
            node.left = node.right;
        node.right = null;
        return node;
    }

    public static Node buildTree(){
        Node root = new Node(1);
        Node left = new Node(2);
        Node right = new Node(3);
        root.left = left;
        root.right = right;

        Node left1 = new Node(4);
        Node left2 = new Node(5);
        left.left = left1;
        left.right = left2;

        Node right1 = new Node(6);
        Node right2 = new Node(7);
        right.left = right1;
        right.right = right2;

        return root;

    }
}
