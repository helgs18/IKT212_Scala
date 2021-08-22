object HOF2 {
  val arr = Array("Luke", "Leia", "Han")

  def p(x: String): Unit = {
    println(x)
  }
  def main(args: Array[String])={
    arr.foreach(p)

    var dbl = ((x:Int) => println(x*x))
    dbl(3)
    ((x:Int)=> println(x*x))(2)   // samme som dbl(2)

    // Anonymous function with list l
    val l = List(1, 1, 2, 3, 4, 5)
    l.foreach((x:Int) => print(x*x + " "))
    println()

    // Small assignment: change the following to use a lambda function. Bruker val arr (Star Wars).
    // def p(x:String):Unit = { println(x) }
    // arr.foreach(p)
    arr.foreach((x: String) => println(x))
    println()
  }

}
