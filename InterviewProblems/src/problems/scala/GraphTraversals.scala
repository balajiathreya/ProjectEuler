package problems.scala

import utils.scala.{Node1, Node}

/**
 * Created with IntelliJ IDEA.
 * User: Balaji Athreya
 * Date: 9/20/13
 * Time: 5:32 PM
 * To change this template use File | Settings | File Templates.
 */
object GraphTraversals {
   def main(args : Array[String]){
      val root = Node.buildTree
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
