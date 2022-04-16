package dailyChallenges


//Given a sorted array, A, with possibly duplicated elements,
// find the indices of the first and last occurrences of a target element, x.
// Return -1 if the target is not found.

object Day_5 {

  def first_last_entry(list: Array[Int], target: Int): Array[Int] ={
    if(!list.contains(target)) Array(-1,-1)

    val last = list.lastIndexOf(target)

    val first = list.indexOf(target)

    Array(first,last)
  }


  def main(args: Array[String]): Unit = {
    println(first_last_entry(Array(1,2,3,4,5,6,9,9,9,9,9,9,9,10), 9).mkString(";"))
  }
}
