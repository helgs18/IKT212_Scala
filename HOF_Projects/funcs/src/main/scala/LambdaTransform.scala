object LambdaTransform {

  // transform function with integer x and
  // function f as parameter
  // f accepts Int and Returns Double
  def transform( x: Int, f: Int => Double) = f(x)

  // Main method
  def main(args: Array[String]): Unit ={
    // lambda is passed to f:Int => Double
    val res = transform(2, r => 3.14 * r * r) // 2 is first argument, f(Int):Double is second.
    val raddy = (r: Int) => 3.14 * r * r
    println("raddy(2) = " + raddy(2))

    println(res)
  }

}
