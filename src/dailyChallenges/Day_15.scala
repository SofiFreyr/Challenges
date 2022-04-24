package dailyChallenges
import scala.math._


//TODO: improve time complexity if possible (current is ~ O(n * n * n)) which is horrible

object Day_15 {

  def pythagoreanTriplets(array: List[Int]) = {
    array.flatMap(element1 => {
      array.map(element2 => {
        array.contains(sqrt((element1 * element1) + element2 * element2))
      })
    }).contains(true)
  }


  def main(args: Array[String]): Unit = {
    println(pythagoreanTriplets(List(3,12,5,13)))
  }
}