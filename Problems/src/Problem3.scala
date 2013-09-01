import collection.mutable.ArrayBuffer

/**
 * author: balaji-xubuntu
 *
 * Problem:
 * The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime factor of the number 600851475143 ?
 */

// TO DO: use one of the advanced algorithms
object Problem3 {
	var number = 600851475143L

	def main(args : Array[String]){
		simpleImplementation()
	}

	/*
	this is seive of erasthothenes - check it out later -
	http://mkaz.com/solog/scala/10-scala-one-liners-to-impress-your-friends.html
	(n: Int) => (2 to n) |> (r => r.foldLeft(r.toSet)((ps, x) => if (ps(x)) ps -- (x * x to n by x) else ps))
	 */

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
