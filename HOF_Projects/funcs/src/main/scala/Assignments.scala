import java.lang.Math

object Assignments {
  // Implement a function that takes in a Double and returns the square root.
  // If the input is less than 0, the function should instead return the text:
  //  "Cannot do square root of a negative number."
  // Use square root from java.lang.Math

  var errorNumberZero = "Cannot do a square root of a negative number"

  def squareRoot(x: Double): String = if(x < 0) errorNumberZero else Math.sqrt(x).toString()

  def main(args: Array[String])={
    println("Square root of 9 is " + squareRoot(9))

    // write a loop that goes through an array of ints to find the largest value
    val numbers = List(1, 4, 2, 1, 3, 9)
    var largestNumber = Int.MinValue
    numbers.foreach((arg: Int) => if(arg > largestNumber) largestNumber = arg)
    var reduceNumber = numbers.reduce((x, y) => x max y)
    var maxNumber = numbers.max
    println("largestNumber = " + largestNumber)
    println("reduceNumber = " + reduceNumber)
    println("maxNumber = " + maxNumber)
    println("minNumber = " + numbers.min)
  }
}
