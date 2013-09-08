import math.BigDecimal.double2bigDecimal

/**
 * author: balaji-xubuntu
 *
 *
 * Problem:
 *
 * A Pythagorean triplet is a set of three natural numbers, a  b  c, for which, a2 + b2 = c2. For example,
 * 32 + 42 = 9 + 16 = 25 = 52. There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 *
 * Formula for pythagorean triplet:
 * a = 2n + 1, b = 2n(n + 1), c = 2n(n + 1) + 1
 */

object Problem9 {

	def main(args : Array[String]){
    for(i <- 1.to(500); j <- (i+1).to(499)){
      val k = 1000 - j - i
      if (k > j && i*i + j*j == k*k){
        val list = List(i,j,k)
        println("list : " + list.mkString(","))
        println("product : " + list.reduce(_ * _))
        println("sum : " + list.reduce(_ + _))
        System.exit(0)
      }
    }
	}
}
