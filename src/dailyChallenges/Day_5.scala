package dailyChallenges


//Given a sorted array, A, with possibly duplicated elements,
// find the indices of the first and last occurrences of a target element, x.
// Return -1 if the target is not found.

object Day_5 {

  def first_last_entry(list: Array[Int], target: Int): Array[Int] ={
    if(!list.contains(target)) new Array[Int](-1,-1)

    val last = list.lastIndexOf(target)

    val first = list.indexOf(target)

    new Array[Int](first,last)
  }


  def main(args: Array[String]): Unit = {
    first_last_entry((1,2,3,4,5,6,10), 9)
  }
}
