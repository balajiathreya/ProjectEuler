package problems.scala

import scala.collection.mutable.ListBuffer
import scala._

/**
 * Created with IntelliJ IDEA.
 * User: Balaji Athreya
 * Date: 10/10/13
 * Time: 9:22 PM
 * To change this template use File | Settings | File Templates.
 */
object MergeSort {

  def main(args : Array[String]){
    val arr = Array(23,253,53,-45,-1,21,1,5550,23,40,9,91,9,2,356,9)
    println(mergesort(arr).mkString(","))
  }

  def mergesort(arr : Array[Int]) : Array[Int] = {
    if (arr.size <= 1)
      arr
    else{
      val arr1 = arr.slice(0,arr.size/2)
      val arr2 = arr.slice((arr.size/2), arr.size)
      val left : Array[Int] = mergesort(arr1)
      val right : Array[Int] = mergesort(arr2)
      merge(left,right)
    }
  }

  def merge(arr1: Array[Int], arr2: Array[Int]) : Array[Int] = {
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
      }
    }
    if (arr1.size != i && arr2.size == j)
      mergedList.appendAll(arr1.slice(i,arr1.size))
    else if (arr1.size == i && arr2.size != j)
      mergedList.appendAll(arr2.slice(j,arr2.size))

    mergedList.toArray
  }
}
