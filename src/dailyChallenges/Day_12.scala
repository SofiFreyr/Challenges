package dailyChallenges

//You are given the root of a binary tree. Invert the binary tree in place.
// That is, all left children should become right children, and all right children should become left children.


object Day_12 {

  // some stolen implementation of Binary Tree because I was lazy
  abstract class BinaryTree {
    def isEmpty: Boolean
  }

  case object EmptyTree extends BinaryTree {
    override def toString: String = "[x]"
    def isEmpty = true
  }

  case class NonEmptyTree(val data: Int, val left: BinaryTree, val right: BinaryTree) extends BinaryTree {
    override def toString: String = s"[$data, $left, $right]"
    def isEmpty = false
  }


  def invertBinaryTree(tree: BinaryTree): BinaryTree = {
    tree match {
      case EmptyTree => tree
      case c: NonEmptyTree => NonEmptyTree(c.data, invertBinaryTree(c.right), invertBinaryTree(c.left))
    }
  }

  def main(args: Array[String]): Unit = {
    val tree = NonEmptyTree(1,
      NonEmptyTree(2, NonEmptyTree(4, EmptyTree, EmptyTree), NonEmptyTree(5, EmptyTree, EmptyTree)),
      NonEmptyTree(3, NonEmptyTree(6, EmptyTree, EmptyTree),EmptyTree))

    println(tree)
    println(invertBinaryTree(tree))
  }
}
