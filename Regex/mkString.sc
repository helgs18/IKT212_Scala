import scala.util.matching.Regex

object mkString
{
    def main(args: Array[String])
    {
        // Applying Regex class
        val Geeks = new Regex("(G|g)fG")
        val y = "GfG is a portal. I like gfG"

        // Displays all the matches separated by a separator
        println((Geeks findAllIn y).mkString(", "))
    }
}
