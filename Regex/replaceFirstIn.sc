import scala.util.matching.Regex

object replaceFirstIn
{
    def main(args: Array[String])
    {
        val x = new Regex("Nidhi")
        val mysql = "My name is Nidhi Singh."

        // replace first match with the 
        // String given below
        println(x replaceFirstIn(mysql, "Rahul"))
    }
}
