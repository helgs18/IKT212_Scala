object TheseStringsGetsLost{
    def f(): Unit = "this String gets lost"
    def g() { "this String gets lost too"}

    def main(args: Array[String])={
        println(f())
        println(g())
    }
}
