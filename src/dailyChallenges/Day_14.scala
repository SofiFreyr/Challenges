package dailyChallenges

import scala.math.pow

//You are given a positive integer N which represents the number of steps in a staircase.
// You can either climb 1 or 2 steps at a time.
// Write a function that returns the number of unique ways to climb the stairs.

object Day_14 {

  def findNumberOfCombinations(stairs: Int) = {

    def fibonachi(currentStairs: Int, prevFib:Int, fibMinusTwo: Int): Int = {
      if(currentStairs == stairs) prevFib + fibMinusTwo
      else fibonachi(currentStairs + 1, prevFib + fibMinusTwo, prevFib)
    }

    fibonachi(2, 1, 1)
  }

  def main(args: Array[String]): Unit = {
    println(findNumberOfCombinations(5))
  }
}
