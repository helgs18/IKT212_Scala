// Virker som det skjer noe løye med buffering her
object shortcircuiting {
  def main(args: Array[String]){
    def salt() = {println("salt");false}
    def pepper() = {println("pepper");true}

    println("salt() = " + salt())
    println("pepper() = " + pepper())
    println("salt() && pepper = " + (salt() && pepper()))
    println("pepper() && salt() = " + (pepper() && salt()))
  }
}
