object Session1 extends App {
  // 1. Function that returns the average of an array
  def average(arr: Array[Double])={
    var sum: Double = 0.0
    arr.foreach(x => {
      sum += x
    })
    sum/arr.length
  }

  // 2. Function that takes an array of Ints as input, and returns median value (purely functional)
  def findMedian(arr: Array[Int]): Double = {
    val length = arr.length
    if(length % 2 == 0){ // velger de to midterste elementene
      (arr.sortWith(_ > _)((length/2)-1) + arr.sortWith(_ > _)(length/2)) / 2.0
    } else {
      arr.sortWith((a,b) => a > b )(length / 2)
    }
  }
  println("average = " + findMedian(Array(1, -4, -1, 1, 1, -3, 0)))

  // 3. Function that takes an array of String as input, and prints the capital letters
  def findCapitalLettes(strings: Array[String])={
    strings.foreach(str => {
      str
        .filter(x => x.isUpper)
        .foreach(x => print(x))
    })
  }
  var myStrings = Array(
    "Mafia 2", "Gran Theft Auto 4", "Need For Speed Heat", "Alan Wake", "Metal Gear Solid", "Silent Hill")
  findCapitalLettes(myStrings)
}
