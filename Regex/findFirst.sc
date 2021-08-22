object findFirst
{
    def main(args: Array[String])
    {
        val portal = "GeeksforGeeks".r
        val CS = "GeeksforGeeks is a CS portal."

        println(portal findFirstIn CS)
    }
}
