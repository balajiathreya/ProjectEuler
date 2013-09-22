package problems.scala

import collection.mutable.ArrayBuffer

/**
 * Created with IntelliJ IDEA.
 * User: Balaji Athreya
 * Date: 9/19/13
 * Time: 3:34 PM
 *
 * Given an array of both positive and negative numbers, find the contiguous range in the array which
 * gives the maximum product. Give an algorithm which runs in O(N).
 */
object MaxProdRange {

  def main(args : Array[String]){
    val buffer = ArrayBuffer(2,3,0,-3,2,1,1,6,-2,-8,-3,4).sortWith( _ < _)
    val maxprod = 0.until(buffer.size - 2).foldLeft(1)((prod,x) => {
      if(buffer(x) <= 0) 1
      else prod*buffer(x)
    })
    println(maxprod)

  }

}
