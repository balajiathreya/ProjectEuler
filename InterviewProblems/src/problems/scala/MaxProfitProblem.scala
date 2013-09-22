package problems.scala

import collection.mutable.ArrayBuffer

/**
 * author: balaji-xubuntu
 *
 * You have a sequence of data which tells about daily prices of a stock (of a company in some market).
 * Given the sequence for N such days tell when should one buy and sell to maximize the profit. (for simplicity
 * Assume you can buy only 1 stock). Prices of stock is same for a single day and you cannot buy and sell on the
 * same day.
 * Edit: You have to buy once only and sell once only. (I also misunderstood Q during interview that we have to tell
 * sequence of buying and selling but it was not the question)
 */
object MaxProfitProblem {

	def main(args : Array[String]){
		val price = new ArrayBuffer[Int]()
		price++=List(2,3,0,-3,2,1,1,6,-2,-8,-3,4)
		var buyIndex = 0
		var sellIndex = 1
		sellIndex.until(price.size).foldLeft(0)((maxprofit,i) => {
			val profit = price(i) - price(buyIndex)
			if (price(i) < price(buyIndex))
				buyIndex = i
			if (maxprofit < profit){
				sellIndex = i
				profit
			}
			maxprofit
		})
		println("buy on "+buyIndex+" for "+price(buyIndex))
		println("sell on "+sellIndex+" for "+price(sellIndex))

	}

}
