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