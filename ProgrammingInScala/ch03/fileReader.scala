import scala.io.Source
object FileReader {
    def main(args: Array[String])={
        if (args.length > 0){
            for (line <- Source.fromFile(args(0)).getLines())
                println(line.length + " " + line)
        }
        else
            Console.err.println("Please enter a filename")
    }
}
