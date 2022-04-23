package dailyChallenges

import javafx.scene.layout.StackPane

//Implement a class for a stack that supports all the regular functions (push, pop)
// and an additional function of max() which returns the maximum element in the stack (return None if the stack is empty).
// Each method should run in constant time.


// Comment: wow, I didn't really think about doing max in constant time,
// but the implementation makes so much sense and is way more elegant than doing it recursively

object Day_13 {

  abstract class Stack{
    def isEmpty(): Boolean
    def pop(): Stack
    def push(h: Int): Stack
    def max(): Int
  }

  case class NonEmptyStack(val value: Int, maximum: Int, val rest: Stack) extends Stack {
    override def isEmpty(): Boolean = false

    override def pop(): Stack = rest

    override def push(h: Int): Stack = {
      if (h > this.maximum) NonEmptyStack(h, h, this)
      else NonEmptyStack(h, this.maximum, this)
    }

    override def max(): Int = maximum
  }

  object EmptyStack extends Stack{
    override def isEmpty(): Boolean = true

    override def pop(): Stack = this

    override def push(h: Int): Stack = NonEmptyStack(h, h, this)

    override def max(): Int = throw new NullPointerException

  }


  def main(args: Array[String]): Unit = {

  }
}
