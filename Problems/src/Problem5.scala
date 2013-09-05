/**
 * author: balaji-xubuntu
 *
 * Problem:
 *
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder. What is
 * the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 *
 * Finding least common multiples by prime factorization
 */

import collection.mutable
import collection.mutable.HashMap
import utils.mathUtils

object Problem5 {

	def main(args : Array[String]){
		val range = 2.to(20)
		val list = range.map(x => mathUtils.getPrimeFactors(x))
		var map = new mutable.HashMap[Int, Int]()
		list.foreach( factorsMap => {
			factorsMap.foreach{
				case (key,value ) => {
					val v = map.getOrElse(key,0)
					map.update(key,Math.max(value,v))
				}
			}
		})
		val lcm = map.keySet.foldLeft(1){(prod,key) =>  {
			prod * Math.pow(key,map(key)).toInt
		}

		}
		println(lcm)

	}


}
