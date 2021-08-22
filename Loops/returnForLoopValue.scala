object returnForLoopValue {
  def main(args: Array[String])={
    val a = Array("apple", "banana", "orange")

    val newArray = for (e <- a) yield e.toUpperCase

    for(e <- newArray) println(e)
  }
}
