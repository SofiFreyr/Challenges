package dailyChallenges


//TODO: Challenge is to do it with O(1) complexity. Read up on Big O and do it

//Given a list of numbers, where every number shows up twice except for one number, find that one number.

object Day_9 {

  def singleNumber(list: List[Int]): Int = {
    list.filter(n => list.count(_ == n) == 1).head
  }


  def main(args: Array[String]): Unit = {
    println(singleNumber(List(1,1,2,2,3,3,4,999,4,5,5,8,8,12,12)))
  }
}
