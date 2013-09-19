import collection.mutable.ArrayBuffer

/**
 * author: balaji-xubuntu
 *
 * Given an array find any three numbers which sum to zero. Give the best algorithm.
 */

object Sumof3NosInArray {

	def main(args : Array[String]){
		val buffer = ArrayBuffer(2,3,0,-3,2,1,1,6,-2,-8,-3,4)
		simpleSol(buffer.sortWith( _ < _))
		println("======")
		anotherSol(buffer.sortWith( _ < _))
	}

	def simpleSol(buffer : ArrayBuffer[Int]){
		0.to(buffer.size - 3).foreach( i => {
			(i+1).to(buffer.size - 2).foreach( j => {
				val diff = 0 - buffer(i) - buffer(j)
				//println(list(i)+"|"+list(j)+"|"+diff)
				if(buffer.slice(j+1,buffer.size).contains(diff))
					println(List(buffer(i),buffer(j),diff).mkString(","))
			})
		})
	}

	def anotherSol(buffer : ArrayBuffer[Int]){
		var start = 0
		var end = buffer.size - 1
		while (start < end){
			val sum = 0 - buffer(start) - buffer(end)
			if (buffer.slice(start + 1, end - 1).contains(sum)){
				println(List(buffer(start),buffer(end),sum).mkString(","))
				start +=1
				end -= 1
			}
			else if (sum > 0){
				end -= 1
			}
			else
				start += 1
		}
	}

}
