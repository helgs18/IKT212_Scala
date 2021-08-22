object Signatures {
  def add(a: Int, b: Int): Int = a + b
  def subtract(a: Int, b: Int): Int = a - b
  def multiply(a: Int, b: Int): Int = a * b

  // calculate(funksjon som tar (funkjson, Int, Int) parameter, og returnerer Int. Selve funsjonen
  // returnerer Unit (skriver kun til skjermen)
  // Det som er etter => forteller oss at, funksjonen i argumentet må returnere Int, og Int argumentene
  // kalles a og b.
  // calculate skriver deretter ut Int verdien som blir returnert fra funskjonen f(a, b)
  def calculate(f: (Int, Int) => Int, a: Int, b: Int): Unit = println(f(a, b))
  def executeAndPrint(f: (Int, Int) => Int, i: Int, j: Int): Unit =
    println(f(i, j))

  def main(args: Array[String]): Unit ={
    // hvordan bruker jeg calculate?
    // calculate(add(4: Int, 5: Int))Unit
    // calculate(add, 4, 5)

    executeAndPrint(add, 3, 2)
    calculate(multiply, 9, 8)
  }
}
