object Factorial{

  def factorial(x: BigInt): BigInt = 
    if(x == 0) 1 else x * factorial(x -1)

  def main(args: Array[String])={
    println("factorial(5) = " + factorial(5))
    println("factorial(30) = " + factorial(30))
  }
}
