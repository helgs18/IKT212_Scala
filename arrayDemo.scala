object arrayDemo
{
  def main(args: Array[String]) =
  {
    var name = Array("gfg", "geeks", "GeeksQuize", 
      "geeksforgeeks")
    println("second element of an array: ")

    println(name(1))

    println("\nAll elements")
    for (a <- name) println(a)
  }
}
