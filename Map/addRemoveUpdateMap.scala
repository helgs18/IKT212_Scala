object AddRemoveUpdateMap {
  def main(args: Array[String])={
    // create an empty map
    //var states = scala.collection.mutable.Map[String, String]()

    // Create a map with initial element
    var states = scala.collection.mutable.Map("AL" -> "Alabama", "AK"-> "Alaska")

    // add element with +=
    states += ("AZ" -> "Arizona")
    states += ("CO" -> "Colorado", "KY" -> "Kentucky")

    // remove elements with -=
    states -= "KY"
    states -= ("AZ", "CO")

    // update elements by reassigning them
    states("AK") = "Alaska, The Big State"

    println(states("AK"))
  }
}
