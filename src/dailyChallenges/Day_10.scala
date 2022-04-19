package dailyChallenges

import scala.annotation.tailrec


//You are given an array of integers in an arbitrary order. Return whether or not it is possible to make the array non-decreasing by modifying at most 1 element to any value.

//  We define an array is non-decreasing if array[i] <= array[i + 1] holds for every i (1 <= i < n).

//Example:

//  [13, 4, 7] should return true, since we can modify 13 to any value 4 or less, to make it non-decreasing.

//  [13, 4, 1] however, should return false, since there is no way to modify just one element to make the array non-decreasing.


object Day_10 {

  def checkIfChangeableToNonDecreasing(list: List[Int]):Boolean = {

    @tailrec
    def helper(leftList: List[Int], oneBefore: Int, current: Int, decreasingSegments: Int = 0): Boolean ={
      println(list.mkString + "||" + oneBefore + "||" + current + "||" + decreasingSegments)
      if(current < oneBefore)
        if(decreasingSegments >= 1) false
        else if (leftList.isEmpty) true
        else helper(leftList.tail, current, leftList.head, decreasingSegments + 1)
      else if(leftList.isEmpty) true
        else helper(leftList.tail, current, leftList.head, decreasingSegments)
    }

    helper(list.tail, 0, list.head)
  }


  def main(args: Array[String]): Unit = {
    println(checkIfChangeableToNonDecreasing(List(5,1,3,2,5)))
  }
}
