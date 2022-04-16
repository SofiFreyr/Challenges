package dailyChallenges

import scala.annotation.tailrec

object Day_7 {

  def sortThreeListObvious(r: Array[Int]): Array[Int] = {
    r.sortWith(_ < _)
  }

  def sortThreeListManual(r: Array[Int]): Array[Int] = {

    @tailrec
    def sortHelper(r: Array[Int], v1: Array[Int], v2: Array[Int], v3: Array[Int]): Array[Int] = {
      if (r.isEmpty) v1 ++ v2 ++ v3
      else
        if (v1.isEmpty) sortHelper(r.tail, v1 :+ r.head, Array.emptyIntArray, Array.emptyIntArray)
        else
          if (v2.isEmpty)
            r.head match {
              case x:Int if x < v1.head => sortHelper(r.tail, v2 :+ r.head, v1 , Array.emptyIntArray)
              case x:Int if x > v1.head => sortHelper(r.tail, v1, v2 :+ r.head, Array.emptyIntArray)
              case x:Int if x == v1.head => sortHelper(r.tail, v1 :+ r.head, Array.emptyIntArray, Array.emptyIntArray)
            }
          else
            if (v3.isEmpty)
              r.head match {
                case x:Int if x > v1.head && x < v2.head  => sortHelper(r.tail, v1, v3 :+ r.head, v2)
                case x:Int if x > v1.head && x > v2.head  => sortHelper(r.tail, v1, v2, v3 :+ r.head)
                case x:Int if x < v1.head => sortHelper(r.tail, v3 :+ r.head, v1, v2)
                case x:Int if x == v1.head => sortHelper(r.tail, v1 :+ r.head, v2, Array.emptyIntArray)
                case x:Int if x == v2.head => sortHelper(r.tail, v1, v2 :+ r.head, Array.emptyIntArray)
            }
            else
              r.head match {
                case x:Int if x == v1.head => sortHelper(r.tail, v1 :+ r.head, v2, v3)
                case x:Int if x == v2.head => sortHelper(r.tail, v1, v2 :+ r.head, v3)
                case x:Int if x == v3.head => sortHelper(r.tail, v1, v2, v3 :+ r.head)
              }
    }

    sortHelper(r, Array.emptyIntArray, Array.emptyIntArray, Array.emptyIntArray)
  }

  def main(args: Array[String]): Unit = {
    val toSort = Array(1, 3, 3, 2, 2, 1, 1, 3, 3, 3, 3, 3, 2, 1)


    println(sortThreeListObvious(toSort).mkString("Array(", ", ", ")"))
    println(sortThreeListManual(toSort).mkString("Array(", ", ", ")"))
  }
}
