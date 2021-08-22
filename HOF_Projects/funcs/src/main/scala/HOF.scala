object HOF {
  // Arguments: f(Int):Int og I:Int. Returnerer f(I): Int.
  def applyToInt(f: (Int => Int), I:Int): Int = {
    return f(I)
  }
  // Arguments: x, som er Int. Returnerer Int.
  def inc(x:Int):Int = {
    return x+1
  }

  def main(args: Array[String])={
    // argumentet er applyToInc, som tar funksjonen inc og 2 (Int) som argumenter.
    println(applyToInt(inc, 2))
  }
}
