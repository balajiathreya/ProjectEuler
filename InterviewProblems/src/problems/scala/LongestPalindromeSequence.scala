package problems.scala

/**
 * Created with IntelliJ IDEA.
 * User: Balaji Athreya
 * Date: 9/21/13
 * Time: 4:39 PM
 * To change this template use File | Settings | File Templates.
 */
object LongestPalindromeSequence {

  def main(args : Array[String]){
    val str = "BBABCBCAB"
    println(lps(str, 0, str.length - 1))
  }

  def lps(str : String, start : Int, end : Int) : Int = {
    if (start == end ) 1
    else if(str.charAt(start) == str.charAt(end)){
      2 + lps(str, start + 1, end - 1)
    }
    else
      Math.max(lps(str, start, end - 1), lps(str, start + 1 , end))
  }

}
