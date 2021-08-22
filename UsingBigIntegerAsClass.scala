import java.math.BigInteger
object UsingBigIntegerAsClass{
  def factorial(x: BigInteger): BigInteger = 
   if (x == BigInteger.ZERO)
     BigInteger.ONE
   else
     x.multiply(factorial(x.subtract(BigInteger.ONE)))

  def main(args: Array[String])={
    val num5: Int = 5
    val num30: Int = 30
    val bigInt5: BigInteger = new BigInteger("5") 
    val bigInt30 = new BigInteger("30")
    println(factorial(bigInt5))
    println(factorial(bigInt30))
  }
}
