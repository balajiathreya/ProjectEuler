package problems.scala

import collection.mutable.ArrayBuffer

/**
 * Created with IntelliJ IDEA.
 * User: bathreya
 * Date: 9/10/13
 * Time: 3:11 PM
 * To change this template use File | Settings | File Templates.
 */
object LongestPath {
	def main(args : Array[String]){
		val root = createTree
		//println(calculateLongestPath(root))
	}

   class Node (var nodeName : String, var left : Node, var right : Node, var leftLength: Int, var rightLength : Int){
    override def toString : String = nodeName
  }
       /*
	def calculateLongestPath(node : Node) : (ArrayBuffer[Node],Int) = {
		if (node.left == null && node.right == null) new Tuple2(ArrayBuffer(node),0)
		val leftTuple = if (node.left == null && node.right != null) calculateLongestPath(node.right) else null
		val rightTuple = if (node.right == null && node.left != null) calculateLongestPath(node.left) else null
		if (leftTuple == null) {
			rightTuple._1.append(node.right)
			(rightTuple._1,rightTuple._2 + node.rightLength)
		}
		else if (rightTuple == null){
			leftTuple._1.append(node.left)
			(leftTuple._1,leftTuple._2 + node.leftLength)
		}
		else{

		}

		//		if (node.left == null && node.right == null)
		//			length
		//		else if (node.left == null && node.right != null)
		//			node.rightLength + calculateLongestPath(length,node.right)
		//		else if (node.left != null && node.right == null)
		//			node.leftLength + calculateLongestPath(length,node.left)
		//		else{
		//			Math.max(node.leftLength + calculateLongestPath(length ,node.left),
		//				node.leftLength + calculateLongestPath(length , node.right))
		//		}

	}
  */

	def createTree : Node = {
		val root = new Node("root",null,null,10,20)
		val left1 = new Node("left1",null, null,22,1)
		val right1 = new Node("right1",null, null, 4,30)
		root.left = left1
		root.right = right1

		val left21 = new Node("left21",new Node("leaf1",null,null,0,0),new Node("leaf2",null,null,0,0),12,55)
		val left22 = new Node("left22",new Node("leaf3",null,null,0,0),new Node("leaf4",null,null,0,0),354,6)
		left1.left = left21
		left1.right = left22

		val right21 = new Node("right21",new Node("leaf5",null,null,0,0),new Node("leaf6",null,null,0,0), 2,8)
		val right22 = new Node("right22",new Node("leaf7",null,null,0,0),new Node("leaf8",null,null,0,0),7,22)
		right1.left = right21
		right1.right = right22

		root
	}

}
