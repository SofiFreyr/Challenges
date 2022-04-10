package dailyChallenges

import scala.math.pow

object Day_1 {

  // Add two numbers as a linked list
  //TODO: do time complexity analysis, optimize in a separate folder

  // You are given two linked-lists representing two non-negative integers.
  // The digits are stored in reverse order and each of their nodes contain a single digit.
  // Add the two numbers and return it as a linked list.

  val list1 = List(3, 2, 1)
  val list2 = List(1, 2, 3, 4)

  def addTwoLinkedIntegers(rightOrderList: List[Int], reversedList: List[Int]): Int = {

    def reversedListHelp(list: List[Int], acc: Int = 0, order: Int = 0): Int = {
      if (list.isEmpty) acc
      else reversedListHelp(list.tail, acc + (list.head * pow(10, order).toInt), order + 1)
    }

    reversedListHelp(rightOrderList) + reversedListHelp(reversedList)
  }

  def main(args: Array[String]): Unit = {
    println(addTwoLinkedIntegers(list1, list2))
  }
}
