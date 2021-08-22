object stringToArray{
    def main(args: Array[String])={
        val str:String = "abcde"
        println(str(0))
        val array: Array[Char] = new Array(5)

        for(i <- 0.to(str.length-1)){
            array(i) = str(i)
        }

        for(i <- 0.to(array.length-1)){
            print(array(i))
            print(" ")
        }

        println()

    }
}
