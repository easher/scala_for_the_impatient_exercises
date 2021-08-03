
object Chapter2 {
  def main(args: Array[String]) = {

  }
  // 1. The signum of a number is 1 if the number is positive, –1 if it is negative, and 0 if it is zero. Write a function that computes this value.
  def signumOfNumber(x: Int): Int = {
    if (x >= 0) {
      1
    } else if (x == 0) {
      0
    } else {
      -1
    }
  }

  // 2.  What is the value of an empty block expression {}? What is its type?
  // An empty block is of type Unit and it's value is analogous to type void in java

  // 3. Come up with one situation where the assignment x = y = 1 is valid in Scala.
  def validXYAssignment(): Unit = {
    var x = {}
    var y = 0
    x = y = 1
  }
  // 4. Write a Scala equivalent for the Java loop
  //  for (int i = 10; i >= 0; i--) System.out.println(i);
  def scalaForLoop(): Unit = {
    for(i <- 10 to 0 by -1) println(i)
  }

  // 6. Write a for loop for computing the product of the Unicode codes of all letters in a string.
  // For example, the product of the characters in “Hello” is 825152896.
  def computeUnicode(s: String): Int = {
    var x: Int = 0
    for(i <- 0 to s.length() - 1)
      x *= s(i).toInt
    x
  }

  // 7. Solve the preceding exercise without writing a loop. (Hint: Look at the StringOps Scaladoc.)
  def pruduct(s: String): Int = {
    var product : Int = 1
    s.foreach(product *= _.toInt)

    product
  }
}
