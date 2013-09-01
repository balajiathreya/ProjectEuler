/**
 * author: balaji-xubuntu
 *
 * Problem:
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

object Problem1 {
  def main(args : Array[String]){
	val sum = 0.until(1000).foldLeft(0)((b,a) => {
		if (a % 3 == 0 || a % 5 == 0)
			b + a
		else
			b
	})
	printf("sum : "+sum)

  }
}
