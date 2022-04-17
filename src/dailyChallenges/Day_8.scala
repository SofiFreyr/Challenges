package dailyChallenges


//TODO: do time complexity and readability analysis, optimize in a separate folder

// You are given a list of numbers, and a target number k.
// Return whether or not there are two numbers in the list that add up to k.

object Day_8 {

  def two_sum(list: List[Int], k: Int) = {
    val set = list.toSet
    val check = for {
      x <- set
    } yield set.contains(5 - x)

    check.contains(true)
  }


  def main(args: Array[String]): Unit = {
    println(two_sum(List(4,7,1,-3,2), 5))
  }
}
