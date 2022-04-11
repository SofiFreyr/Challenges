package dailyChallenges

import scala.annotation.tailrec

//TODO: do time complexity and readability analysis, optimize in a separate folder

//Given a string, find the length of the longest substring without repeating characters.


object Day_2 {

  def lengthOfLongestSubstring(str: String): Int = {
    @tailrec
    def lengthHelper(str: Array[Char], acc: Array[Char] = Array.emptyCharArray, currentIndex: Int = 0, largest: Int = 0): Int ={
      if(str.length == 0 || currentIndex == str.length) if(largest > currentIndex) largest else currentIndex
      else if (acc.contains(str(currentIndex))) {
        if (currentIndex > largest)
          lengthHelper(str.takeRight(str.length - currentIndex), Array.emptyCharArray, 0, currentIndex)
        else lengthHelper(str.takeRight(str.length - currentIndex), Array.emptyCharArray, 0, largest)
      }
      else lengthHelper(str,acc :+ str(currentIndex), currentIndex+1, largest)
    }

    lengthHelper(str.toCharArray)
  }

  def main(args: Array[String]): Unit = {
    println(lengthOfLongestSubstring("hahjklbnmnhhhasdfghjk"))
  }
}
