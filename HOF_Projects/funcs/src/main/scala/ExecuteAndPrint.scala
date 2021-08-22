object ExecuteAndPrint {
  // executeAndPrint:
  // Signature: val f:(Int, Int) => Int = (a, b) => a + b
  // Type signature:
  //    (Int, Int) => Int
  // Input paramters:
  //    (a, b)
  // Body of the function:
  //    a + b
  //
  // Scala's consistency is show here, where this function type:
  //    val f: (Int, Int) => Int
  // is the same as the type signature you use to define a function input parameter:
  //    def executeAndPrint(f: (Int, Int) => Int
  def executeAndPrint(f: (Int, Int) => Int, a: Int, b: Int) = println(f(a, b))
  def add(a: Int, b: Int) = a + b
  def main(args: Array[String])={
    executeAndPrint(add, 6, 4)
  }

}
