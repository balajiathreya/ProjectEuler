package problems.scala

import collection.mutable.ListBuffer

/**
 * Created with IntelliJ IDEA.
 * User: Balaji Athreya
 * Date: 10/12/13
 * Time: 12:39 PM
 * To change this template use File | Settings | File Templates.
 */
object InversionCount {

  def main(args : Array[String]){
//    val arr = Array(23,253,53,-45,-1,21,1,5550,23,40,9,91,9,2,356,9)
    val arr = Array(2, 4, 1, 3, -2)
    val tuple = Tuple2(arr,0)
    println(sortAndCount(tuple._1)._2)
  }

  def sortAndCount(arr : Array[Int]) : Tuple2[Array[Int],Int] = {
    if (arr.size > 1){
      val arr1 = arr.slice(0,arr.size/2)
      val arr2 = arr.slice((arr.size/2), arr.size)
      val leftTuple : Tuple2[Array[Int],Int] = sortAndCount(arr1)
      val rightTuple : Tuple2[Array[Int],Int] = sortAndCount(arr2)
      val mergeAndCountedTuple = mergeAndCount(leftTuple._1,rightTuple._1)
      Tuple2(mergeAndCountedTuple._1, leftTuple._2 + rightTuple._2 + mergeAndCountedTuple._2)
    }
    else
      Tuple2(arr,0)
  }

  def mergeAndCount(arr1: Array[Int], arr2: Array[Int]) : Tuple2[Array[Int],Int] = {
    var count = 0
    var i = 0
    var j = 0
    val mergedList : ListBuffer[Int] = ListBuffer()
    while(i < arr1.size && j < arr2.size){
      val h1 = arr1(i)
      val h2 = arr2(j)
      if (h1 < h2){
        mergedList.append(h1)
        i = i + 1
      }
      else{
        mergedList.append(h2)
        j = j + 1
        count = count + 1
      }
    }
    if (arr1.size != i && arr2.size == j)
      mergedList.appendAll(arr1.slice(i,arr1.size))
    else if (arr1.size == i && arr2.size != j)
      mergedList.appendAll(arr2.slice(j,arr2.size))
      Tuple2(mergedList.toArray,count)
  }
}
