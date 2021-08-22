object Fre20_08pdf {

  def max(x: Int, y: Int): Int = { if(x > y) return x else y }
  def min(a:Int, b:Int)= { if(a<b)a else b }

  def main(args: Array[String])={
    // max
    print(max(2, 3))
    println(" " + max(3, 2))
    // min
    print(min(3, 2))
    println(" " + min(2, 3))

    // setValue
    setValue(5, update_y)
    println(y)

    println(f)
  }
  var y = 0; var z = 0
  def update_y(x: Int) = (y = x)
  def setValue(x: Int, f: Int => Unit) = f(x)
  def setValue_original(x: Int):Unit = {
    y = x
  }

  def f = 2

}
