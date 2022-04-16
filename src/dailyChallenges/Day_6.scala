package dailyChallenges


//TODO: do time complexity and readability analysis, optimize in a separate folder
//Given a singly-linked list, reverse the list. This can be done iteratively or recursively. Can you get both solutions?

object Day_6 {


  def reverse_linked_list_recursion(l: List[Int], r: List[Int] = List.empty): List[Int] ={
    if(l.isEmpty) r
    else reverse_linked_list_recursion(l.tail, List.concat(List(l.head),r))
  }


  def reverse_linked_list_iterative(l: List[Int]): List[Int]={
    var list: List[Int] = List()
    for (element <- l) do {
      list = list :+ element
    }
    list
  }


  def main(args: Array[String]): Unit = {
    println(reverse_linked_list_recursion(List(1,2,3,4,5)))

    println(reverse_linked_list_recursion(List(1,2,3,4,5)))
  }
}
