object listMultiplier {
    def main(args: Array[String])={
        val l = List(1, 1, 2, 3, 5, 8)

        val res = l.map( (x:Int) => x * x)

        println(res)
        }
}
