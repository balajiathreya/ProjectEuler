import collection.mutable.ArrayBuffer

/**
 * Created with IntelliJ IDEA.
 * User: Balaji Athreya
 * Date: 9/20/13
 * Time: 5:22 PM
 * To change this template use File | Settings | File Templates.
 */
object PerfectSquare {

  def main(args : Array[String]){
    val num = ArrayBuffer(892080,892081)
    val nearestNumbers = num.map(getNearestNum(_))
    val nearestNumbers1 = num.map(getNearestNum1(_))
    println(num)
    println(nearestNumbers.map( x => x*x))
    println(nearestNumbers1.map( x => x*x))
  }

  def getNearestNum(num : Int) : Int = (Math.sqrt(num) + 0.5).toInt
  def getNearestNum1(num : Int) : Int = Math.sqrt(num).round.toInt

}
