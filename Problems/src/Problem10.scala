import collection.mutable.ArrayBuffer
import akka.actor.Actor
import akka.actor.Props

/**
 * Created with IntelliJ IDEA.
 * User: Balaji Athreya
 * Date: 9/8/13
 *
 * Problem:
 *
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17. Find the sum of all the primes below two million.
 */
object Problem10 {

  def main(args : Array[String]){
    var primes = ArrayBuffer[Int](2,3,5,7,11)
    var i = primes.last + 2
    var t = 4
    var sum = primes.reduce(_ + _)
    i.to(2000000).by(6 - t).foreach(i =>{
      val multipleOfPrime = primes.filter( _ <= Math.sqrt(i).toInt).foldLeft(false)((divisible,prime) => {
        divisible || (i % prime == 0)
      })
      if (!multipleOfPrime) {
        primes += i
        sum += i
      }
      t = 6 - t
    })
    println("sum "+sum)
  }

//  class PrimeActor extends Actor{
//
//  }

}

