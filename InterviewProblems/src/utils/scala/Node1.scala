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
