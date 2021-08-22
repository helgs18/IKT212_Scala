// Scala program to demonstrate the Operators

// Creating object
object Operators
{
  // Main method
  def main(args: Array[String]) =
  {
    // Operands
    var a = 10;
    var b = 4;
    var c = true;
    var d = false;
    var result = 0;

    // Using arithmetic operators
    println("Addition is: " + (a + b) );
    println("Subtraction is: " + (a - b) );

    // using Relational Operators
    if(a == b)
    {
      println("Equal to Operator is True");
    } else {
      println("Equal to Operator is False");
    }
	
    // Using Logical Operator 'OR'
    println("Logical Or of a || b = " + (c || d));

    // using Bitwise AND Operator
    result = a & b;
    println("Bitwise And: " + result);

    // using Assignment Operators
    println("Addition Assignment Operator: " + (a += b) );
  }
}
