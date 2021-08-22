object Main {
  // takes a function without parameters and that returns Unit (nothing)
  def sayHello(f: () => Unit): Unit = f()
  // functions without parameters and returns Unit (nothing)
  def printHello() = println("Hello, world!")
  def bonjourJulien():Unit =  println("Bonjour, Julien")

  def main(args: Array[String])={
    sayHello(printHello)
    sayHello(println)
    sayHello(bonjourJulien)
  }
}
