package utils.scala

/**
 * Created with IntelliJ IDEA.
 * User: Balaji Athreya
 * Date: 9/21/13
 * Time: 7:58 PM
 * To change this template use File | Settings | File Templates.
 */
class Node(v : Int){
  var left : Node = null
  var right : Node = null
  var value = v

  def setLeft(l : Node) {left = l}
  def setRight(r : Node) {right = r}

  override def toString = value.toString

}

object Node{

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