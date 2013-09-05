import collection.mutable.ArrayBuffer

/**
 * author: balaji-xubuntu
 *
 * Problem:
 *
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 *
 */
object Problem7 {
	def main(args : Array[String]) {
		var primes = new ArrayBuffer[Int]()
		primes = primes ++ ArrayBuffer(2,3,5,7,11)
		var i = primes.last + 2
		while(primes.size != 10001){
			val multipleOfPrime = primes.filter( _ <= Math.sqrt(i).toInt).foldLeft(false)((divisible,prime) => {
				divisible || (i % prime == 0)
			})
			if (!multipleOfPrime) primes += i
			i = i + 2
		}
		println(primes.mkString(","))
		println(primes.size)
		println("nth prime: "+ primes.last)

	}
}
