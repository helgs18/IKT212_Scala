object LambdaMap {

  def transform( l:List[Int], f:Int => Double) = l.map(f)

  def main(args: Array[String])={
    // lambda is passed to f:Int => Double
    val res = transform(List(1, 2, 3), r => 3.14 * r * r)
    println(res)
  }
}
