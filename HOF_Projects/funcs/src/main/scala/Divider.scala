object Divider {

  // divide by 2
  def divBy2(a:Double) = a / 2

  // changing the original array
  def divideAll(array: Array[Double], f: Double => Double):Unit={
    for(i <- 0 to array.length - 1){
      array(i) = f(array(i))
    }
  }

  // #2: returning a new array
  def returnDivided(array: Array[Double], f: Double => Double): Array[Double]={
    var newArray = new Array[Double](array.length)
    for(i <- 0 to array.length - 1){
      newArray(i) = f(array(i))
    }
    newArray
  }

  def main(args: Array[String])={
    /* Assignment: Make a function diving an int by 2
    // Create a higher order function that applies the function each element in an array and prints it out.*/
    var numbers = Array(1.0, 2.4, 1.3, 9.0, 4.1, 3.999, 0, 5)
    println("numbers(0): " + numbers(0) + " (before changes)")

    // #1: use function that uses a for loop and changes the original array
    divideAll(numbers, divBy2)

    // #2: use function that uses for loop and returns a new array
    val numbers2 = returnDivided(numbers, divBy2)

    // #3: using lambda
    var divider = (a:Double) => a / 2
    val numbers3 = numbers.map(divider)

    // #4: using map
    val numbers4 = numbers.map(divBy2)

    println("numbers(0): " + numbers(0) + " (after updating the original array")
    // the rest of the arrays are the updated arrays elements / 2
    println("numbers2(0): " + numbers2(0))
    println("numbers3(0): " + numbers3(0))
    println("numbers4(0): " + numbers4(0))
  }
}
