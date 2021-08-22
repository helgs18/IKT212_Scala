import scala.util.matching.Regex

object replaceFirstIn
{
    def main(args: Array[String])
    {
        val x = new Regex("He.*oen")
        val myself = "My name is Helge Stegemoen."

        // replace first match with the 
        // String given below
        println(x replaceFirstIn(myself, "Superman"))
    }
}
