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
   val (root,newRoot) = buildTree
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

  def buildTree : (Node1,Node1) = {
    val root = new Node1(1)
    val left = new Node1(2)
    val right = new Node1(3)
    root.left = left
    root.right = right
    left.parent = root
    right.parent = root

    val left1 = new Node1(4)
    val left2 = new Node1(5)
    left.left = left1
    left.right = left2
    left1.parent = left
    left2.parent = left

    val right1 = new Node1(6)
    val right2 = new Node1(7)
    right.left = right1
    right.right = right2
    right1.parent = right
    right2.parent = right

    (root, right1)
  }
}
