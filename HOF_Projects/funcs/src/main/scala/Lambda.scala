object Lambda {
  def ex1_normal(x: Int) = x + 2
  def ex2_normal(a: Int, b: Int) = a * b

  def main(args: Array[String])={
    println(ex1_normal(14))
    println(ex2_normal(14, 5))

    // lambda expression
    val ex1 = (x: Int) => x + 2
    println(ex1(4))

    // with multiple parameters
    val ex2 = (x:Int, y:Int) => x * y
    println(ex2(4,3))

    val flux = (x: String) => "x = " + x
    println(flux("X.toLower()"))

    val l = List(1, 1, 2, 3, 5, 8)
    val res = l.map( (x: Int) => x * x)
    println(res)
  }
}
