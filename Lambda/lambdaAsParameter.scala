object lambdaAsParameter{
    // transform function with integer x and
    // function f as parameter
    // f accept Int and returns Double
    def transform( x:Int, f:Int => Double) = f(x)

    def main(args: Array[String])={
        val res = transform(2, r => 3.14 * r * r)

            println(res)
    }
}
