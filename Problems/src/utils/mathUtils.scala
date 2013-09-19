package utils

import collection.mutable.ArrayBuffer
import collection.mutable.HashMap
import collection.mutable

/**
 * author: balaji-xubuntu
 */
object mathUtils {
	def getPrimeFactors(num : Int) : HashMap[Int, Int] = {
		val factorsMap = new mutable.HashMap[Int, Int]()
		var number = num
		var i = 2
		while (number != 1){
			if (number % i != 0)    i += 1
			else{
				number = number / i
				factorsMap.update(i, factorsMap.getOrElseUpdate(i,0) + 1)
			}
		}
		factorsMap
	}


}
