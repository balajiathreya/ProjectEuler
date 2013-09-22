package problems.scala

/**
 * Created with IntelliJ IDEA.
 * User: bathreya
 * Date: 9/10/13
 * Time: 10:54 AM
 * To change this template use File | Settings | File Templates.
 */
object ReversingBinaryTreeProblem {
//	var leaf = new Node(-1)
//
//	def main(args : Array[String]){
//		val rootNode = createTree
//		if (!flipTree(rootNode,null,rootNode.left))
//			flipTree(rootNode,null,rootNode.right)
//		println(leaf)
//	}
//
//
//	def flipTree(root : Node, parent: Node, child : Node) : Boolean = {
//		root match {
//			case null => true
//			case _ if(root == leaf) => {
//				if (child == root.left) root.left = parent
//				else    root.right = parent
//				false
//			}
//			case _ => {
//				var res = flipTree(root.left,root,child)
//				if (res)
//					res = flipTree(root.right,root,child)
//				if (!res){
//					if (child == root.left) root.left = parent
//					else    root.right = parent
//				}
//				res
//			}
//		}
//
//
//	}

//	def reverseTree(node : Node) : Node = {
//		if (node == null || node.parent == null) node
//		else{
//			node.right = node.parent
//			if (node.parent.right == node){
//				node.parent.right = node.parent.left
//				node.parent.left = node.parent.parent
//				if (node == leaf) node.parent = null
//				reverseTree(node.right.left)
//			}
//			else{
//				node.parent.left = node.parent.right
//				node.parent.right = node.parent.parent
//				if (node == leaf) node.parent = null
//				reverseTree(node.right.right)
//			}
//		}
//	}

//	def createTree : Node = {
//		val root = new Node(1)
//		val left1 = new Node(2)
//		val right1 = new Node(3)
//		val left2 = new Node(4)
//		val left22 = new Node(5)
//		val right2 = new Node(6)
//		val right22 = new Node(7)
//
//		root.left = left1
//		root.right = right1
//
//		left1.left = left2
//		left1.right = left22
//
//		right1.left = right2
//		right1.right = right22
//
//		leaf = right2
//		root
//	}
//
//
//}
//
//class Node(var value : Int, var left : Node, var right : Node){
//
//	def this(v : Int) = {
//		this(v,null,null)
//	}
//
//
}
