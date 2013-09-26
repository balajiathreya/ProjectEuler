package problems.java;

import utils.java.Node;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created with IntelliJ IDEA.
 * User: Balaji Athreya
 * Date: 9/26/13
 * Time: 8:27 AM
 * To change this template use File | Settings | File Templates.
 */
public class LongestPossiblePath {
    public static void main(String[] args){
        Node root = Node.buildTree();
        Tuple rootTuple = new Tuple(root,new ArrayList<Node>());
        rootTuple.node = root;
        Tuple t = processTree(rootTuple);
        System.out.println(t);
    }

    public static Tuple processTree(Tuple tuple){
        Node node = tuple.node;
        Tuple left = null;
        Tuple right = null;
        if(node.getLeft() == null && node.getRight() == null){
            return tuple;
        }
        if(node.getLeft() != null){
            left = new Tuple(node.getLeft(),tuple.path);
            left = processTree(left);
        }
        if(node.getRight() != null){
            right = new Tuple(node.getRight(),tuple.path);
            right = processTree(right);
        }
        if(right == null)
            return left;
        else if(left == null)
            return right;
        else if(left.path.size() > right.path.size())
            return left;
        return right;

    }


    static class Tuple{
        private Node node;
        private ArrayList<Node> path = new ArrayList<Node>();

        Tuple(Node n, ArrayList<Node> oldPath){
            node = n;
            path = new ArrayList<Node>();
            path.addAll(oldPath);
            path.add(n);
        }
    }
}
