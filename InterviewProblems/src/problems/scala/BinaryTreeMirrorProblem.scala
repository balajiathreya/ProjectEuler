package problems.scala

import utils.scala.Node

/**
 * Created with IntelliJ IDEA.
 * User: Balaji Athreya
 * Date: 9/19/13
 * Time: 5:59 PM
 *
 * Given a binary tree, it mirrors the tree left to right
 */
object BinaryTreeMirrorProblem {

  def main(args : Array[String]){
    val root = Node.buildTree
    val mirroredRoot = mirrorBT(root)
    println(mirroredRoot)
  }

  def mirrorBT(root : Node) : Node = {
    if(root.left == null && root.right == null) root
    else if (root.left == null){
      root.left = root.right
      root.right = null
      root
    }
    else if (root.right == null){
      root.right = root.left
      root.left = null
      root
    }
    else{
      val right= mirrorBT(root.left)
      val left = mirrorBT(root.right)
      root.left = left
      root.right = right
      root
    }
  }

}

