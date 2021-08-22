object Operators {


  def main(args: Array[String])={
    val s = "Hi Class in Computer Science"
    s.indexOf('C')
    val c = s indexOf 'C' // You can ommit dot (.) so-called operator notion
    val c_after5 = s indexOf('C', 5) // Parenthesis can be omitted when there is a single paramter (
                      // or remaining are implicit). Atleast in version 2

    println(c)
    println(c_after5)

    // Function call vs operator
    println(    (5).+(4)  )   // Function call
    println( s.indexOf('o') ) // Function call
    println( 5 + 4 )          // Operator

  }
}
