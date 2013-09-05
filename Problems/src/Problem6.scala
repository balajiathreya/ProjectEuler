/**
 * User: balaji-xubuntu
 *
 * Problem:
 *
 * The sum of the squares of the first ten natural numbers is, 12 + 22 + ... + 102 = 385
 * The square of the sum of the first ten natural numbers is, (1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
object Problem6 {
	def main(args : Array[String]){
		val range = 1.to(100)
		val square_of_sum = {
			val i = range.foldLeft(0)(_ + _)
			i*i
		}
		val sum_of_squares = range.fold(0)((result,n) => result + n*n)
		println(sum_of_squares - square_of_sum)
	}

}
