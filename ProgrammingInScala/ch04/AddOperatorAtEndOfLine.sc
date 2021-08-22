object AddOperatorAtEndOfLine{
    val x = 1
    val y = 2
    val z = 3

    def main(args: Array[String]){
        println(
        x 
        + y
        + z
        )

        x +
        y +
        z 

        // Doesn't work without plus at end of line and without parantheses
        // x
        // + y
        // + z

    }
}
