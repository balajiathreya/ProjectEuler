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
    val root = buildTree
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
}

