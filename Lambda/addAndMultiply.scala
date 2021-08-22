object addAndMultiply{
    def main(args:Array[String])={
        val ex1 = (x:Int) => x + 2

        val ex2 = (x:Int, y:Int) => x * y

        println(ex1(5))
        println(ex2(2,3))
    }
}
