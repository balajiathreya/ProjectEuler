package problems.scala

/**
 * Created with IntelliJ IDEA.
 * User: Balaji Athreya
 * Date: 10/8/13
 * Time: 6:10 PM
 * TBD: needs fixes
 */
object SelectKFromTwoSortedArrays {

  def main(args : Array[String]){
    val A : List[Int] = List(3,3,5,6,7,8,9)
    val B : List[Int] = List(-5,-4,0,1,3,5,6,22,74,534)
    val k = 3
    val m = (A ++ B).distinct

    println(m.sortWith( _ < _))
    print("auto: ")
    println(m.sortWith( _ < _)(k))
    println(selectk(A,B,k))
  }

  def selectk(arr1 : List[Int], arr2: List[Int], k : Int) : Int = {
    if(arr1.size == 0)
      arr2(k)
    else if (arr2.size == 0)
      arr1(k)
    else{
      val m = arr1.size/2
      val n = arr2.size/2
      if ( m + n < k){
        if (arr1(m) < arr2(n))
          selectk(arr1.slice(m,arr1.size), arr2,k - m - 1)
        else
          selectk(arr1,arr2.slice(n,arr2.size),k - n - 1)
      }
      else{
        if (arr1(m) < arr2(n))
          selectk(arr1.slice(0,m),arr2,k)
        else
          selectk(arr1, arr2.slice(0,n),k)
      }
    }
  }

}
