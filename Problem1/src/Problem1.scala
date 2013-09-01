/**
 * @author: balaji-xubuntu
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
