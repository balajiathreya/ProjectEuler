/**
 * author: balaji-xubuntu 
 */
object Problem2 {
	var sum = 2
	def main(args : Array[String]){
		println(1)
		println(2)
		println("sum: "+generateFibonacciSum(1,2))
	}

	def generateFibonacciSum(i : Int, j : Int) : Int = {
		val k = i + j
		println(k+","+sum)
		if (k > 4000000)    sum
		else{
			if (k % 2 == 0) sum = sum + k
			generateFibonacciSum(j , k)
		}
	}

}
