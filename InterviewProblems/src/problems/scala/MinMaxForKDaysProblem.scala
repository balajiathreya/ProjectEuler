package problems.scala

import collection.mutable.ArrayBuffer
import collection.mutable

/**
 * Created with IntelliJ IDEA.
 * User: Balaji Athreya
 * Date: 9/22/13
 * Time: 11:32 AM
 *
 * A set of integer values are being received (1 per day). Store these values and at any given time, retrieve the min
 * and max value over the last k days. What structures would you use for storing and retrieving ?
 */
object MinMaxForKDaysProblem {

  def main(args : Array[String]){
    val buf = ArrayBuffer(2,5,2,-33,77,9,0,12,5345,211,1,6,8,34,4)
    val minmaxTupleList = 0.until(buf.length).map(x => getMinMaxForRange(buf,x - 3,x))
    println(minmaxTupleList)
  }

  def getMinMaxForRange(values : ArrayBuffer[Int], start : Int , end : Int) : Tuple2[Int,Int] = {
    val from = Math.max(0,start)
    val until = Math.min(end,values.length - 1)
    val range : ArrayBuffer[Int] = if(from == until) ArrayBuffer(values(from)) else values.slice(from, until+1)
    val tuple = range.foldLeft((range(0),range(0))) ( (minMaxPair:Tuple2[Int,Int],x : Int) => {
        new Tuple2(Math.min(x,minMaxPair._1),Math.max(x,minMaxPair._2))
    })
    tuple
  }

}
