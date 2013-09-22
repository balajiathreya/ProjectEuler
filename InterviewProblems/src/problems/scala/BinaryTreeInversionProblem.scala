package problems.scala

import utils.scala.Node1

/**
 * Created with IntelliJ IDEA.
 * User: Balaji Athreya
 * Date: 9/20/13
 * Time: 4:12 PM
 *
 */
object BinaryTreeInversionProblem {

 def main(args : Array[String]){
   val (root,newRoot) = Node1.buildTree
   var node  = invertTree(root,newRoot)
   println(node)

 }


  def invertTree(node : Node1, newRoot : Node1) : Node1 = {
    if ( node == null) null
    else if (invertTree(node.left,newRoot) != null){
      val parent = node.parent
      node.parent = node.left
      node.left = parent
    }
    else if (invertTree(node.right,newRoot) != null){
      val parent = node.parent
      node.parent = node.right
      node.right = parent
    }
    node
  }

}
