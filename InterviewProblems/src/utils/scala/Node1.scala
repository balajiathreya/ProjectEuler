package utils.scala

/**
 * Created with IntelliJ IDEA.
 * User: Balaji Athreya
 * Date: 9/21/13
 * Time: 7:58 PM
 * To change this template use File | Settings | File Templates.
 */
class Node1(v : Int){
  var parent : Node1 = null
  var left : Node1 = null
  var right : Node1 = null
  var value = v

  def setLeft(l : Node1) {left = l}
  def setRight(r : Node1) {right = r}

  override def toString = value.toString
}

object Node1{


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
