/**
 * author: balaji-xubuntu
 *
 * Problem:
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit
 * numbers is 9009 = 91  99. Find the largest palindrome made from the product of two 3-digit numbers.
 */
object Problem4 {

	def main(args : Array[String]){
		998001.to(10000).by(-1).foreach( i => {
			if (checkIfPalindrome(i)){
			    100.to(999).foreach( j => {
				    val x = i/j
				    if (i % j == 0 && x >= 100 && x <= 999){
						println(i)
					    System.exit(0)
				    }
			    })
			}
		})
	}

	def checkIfPalindrome(i : Int) : Boolean = {
		val str = i.toString
		str.equalsIgnoreCase(str.reverse)
	}

}
