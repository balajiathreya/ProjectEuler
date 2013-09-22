package problems.scala

import utils.scala.Node

/**
 * Created with IntelliJ IDEA.
 * User: Balaji Athreya
 * Date: 9/20/13
 * Time: 5:32 PM
 * To change this template use File | Settings | File Templates.
 */
object GraphTraversals {

  def buildTree : Node = {
    val root = new Node(1)
    val left = new Node(2)
    val right = new Node(3)
    root.left = left
    root.right = right

    val left1 = new Node(4)
    val left2 = new Node(5)
    left.left = left1
    left.right = left2

    val right1 = new Node(6)
    val right2 = new Node(7)
    right.left = right1
    right.right = right2

    root
  }

   def main(args : Array[String]){
      val root = buildTree
     println("recursive in order")
     recursiveInOrderTraversal(root)
     println("\n=========================")
     println("recursive pre order")
     recursivePreOrderTraversal(root)
     println("\n=========================")
     println("recursive post order")
     recursivePostOrderTraversal(root)
   }

  def recursiveInOrderTraversal(node : Node){
    if (node != null){
      recursiveInOrderTraversal(node.left)
      print(node.value+" ")
      recursiveInOrderTraversal(node.right)
    }
  }
  def recursivePreOrderTraversal(node : Node){
    if (node != null){
      print(node.value+" ")
      recursivePreOrderTraversal(node.left)
      recursivePreOrderTraversal(node.right)
    }
  }
  def recursivePostOrderTraversal(node : Node){
    if (node != null){
      recursivePostOrderTraversal(node.left)
      recursivePostOrderTraversal(node.right)
      print(node.value+" ")
    }
  }
}
