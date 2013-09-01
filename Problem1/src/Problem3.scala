import collection.mutable.ArrayBuffer

/**
 * author: balaji-xubuntu 
 */

// TO DO: use one of the advanced algorithms
object Problem3 {
	var number = 600851475143L

	def main(args : Array[String]){
		simpleImplementation()
	}

	def simpleImplementation() {
		var num = number
		var primes = new ArrayBuffer[Long]()
		primes += 2
		var current_divisor = 2
		var largest_divisor = 0
		while (num != 1) {
			if (num % current_divisor == 0) {
				num = num / current_divisor
				largest_divisor = current_divisor
			}
			else
				current_divisor = current_divisor + 1
		}
		println(largest_divisor)
	}
}
