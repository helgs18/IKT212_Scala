object whileLoopDemo
{
  // Main method
  def main(args: Array[String]) = {

    var x = 1;

    // Exit when x becomes greater than 4
    while (x <= 4)
    {
      println("Value of x: " + x);

      x = x + 1;
    }
  }
}
