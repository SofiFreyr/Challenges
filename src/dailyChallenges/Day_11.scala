package dailyChallenges


// TODO: Analyze this whole mess, refactor and re-do if necessary

// Given an integer k and a binary search tree,
// find the floor (less than or equal to) of k, and the ceiling (larger than or equal to) of k.
// If either does not exist, then print them as None.

object Day_11 {


  case class Node(value: Int, left: Node = null,right: Node = null) {
  }

  def findCeilingFloor(root_node: Node , k: Int, floor: Int = Int.MinValue, ceil:Int = Int.MaxValue): String = {

    def floorHelper(node: Node, floor: Int): Int ={
      if(node == null) return floor
      if(node.value == k) return node.value
      if(node.value < k) {
        if (node.value > floor) floorHelper(node.right, node.value)
        else floorHelper(node.right, floor)
      }
      else floorHelper(node.left, floor)
    }

    def ceilingHelper(node: Node, ceiling: Int): Int = {
      if(node == null) return ceiling
      if(node.value == k) return node.value
      if(node.value > k ) {
        if (node.value < ceiling) ceilingHelper(node.left, node.value)
        else ceilingHelper(node.left, ceiling)
      }
      else ceilingHelper(node.right, ceiling)
    }


    if(root_node == null){
      if(floor == Int.MinValue)
        if(ceil == Int.MaxValue)
          return "Nothing found"
        else return s"$k, None, $ceil"
      else
        if(ceil == Int.MaxValue) return s"$k, $floor, None"
        else return s"$k, $floor, $ceil"
    }
    else
      findCeilingFloor(null, k, floorHelper(root_node, floor), ceilingHelper(root_node, ceil))

  }

  def main(args: Array[String]): Unit = {

    val tree = Node(8, Node(4, Node(2),Node(6)), Node(12, Node(10), Node(14)))

    println(findCeilingFloor(tree, 5))

  }
}
