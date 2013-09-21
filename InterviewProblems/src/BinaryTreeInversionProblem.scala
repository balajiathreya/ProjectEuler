/**
 * Created with IntelliJ IDEA.
 * User: Balaji Athreya
 * Date: 9/20/13
 * Time: 4:12 PM
 *
 */
object BinaryTreeInversionProblem {

  class Node(v : Int){
    var parent : Node = null
    var left : Node = null
    var right : Node = null
    var value = v

    override def toString = value.toString
  }

 def main(args : Array[String]){
   val (root,newRoot) = buildTree
   var node  = invertTree(root,newRoot)
   println(node)

 }


  def invertTree(node : Node, newRoot : Node) : Node = {
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

  def buildTree : (Node,Node) = {
    val root = new Node(1)
    val left = new Node(2)
    val right = new Node(3)
    root.left = left
    root.right = right
    left.parent = root
    right.parent = root

    val left1 = new Node(4)
    val left2 = new Node(5)
    left.left = left1
    left.right = left2
    left1.parent = left
    left2.parent = left

    val right1 = new Node(6)
    val right2 = new Node(7)
    right.left = right1
    right.right = right2
    right1.parent = right
    right2.parent = right

    (root, right1)
  }
}
