import collection.mutable.ArrayBuffer

/**
 * author: balaji-xubuntu
 *
 *
 * Design a stack in such a way that the operations Push, Pop and Find Minimum can be done in O(1).
 * Assume space as not a constraint.
 */

object MinStackProblem{
	def main(args : Array[String]){
		val prob = new MinStackProblem()
		val args1 = List(110,32,2343,56,453,112,182,29)
		for (arg <- args1){
			prob.push(arg)
		}
		prob.pop()
		println(prob.minStack.mkString(","))
	}
}


class MinStackProblem {
	private val stack = new ArrayBuffer[Int]()
	private val minStack = new ArrayBuffer[Int]()

	def push(n : Int){
		stack += n
		if (minStack.isEmpty) minStack += n
		else if (minStack.last >= n) minStack += n
	}

	def pop(){
		if (!stack.isEmpty){
			val top = stack.last
			stack -= top
			if (top == minStack.last ) minStack -= top
		}

	}

}
