object AddRemoveUpdateMap {
  def main(args: Array[String])={
    // create an empty map
    //var states = scala.collection.mutable.Map[String, String]()

    // Create a map with initial element
    var states = scala.collection.mutable.Map("AL" -> "Alabama", "AK"-> "Alaska")

    // add element with +=
    // states += ("AZ" -> "Arizona")
    // states += ("CO" -> "Colorado", "KY" -> "Kentucky")
    states.addOne("AZ", "Arizona")
    states.addOne("CT", "Connecticut")

    // remove elements with -=
    states.remove("KY")
    states.remove("CO")

    for ((k, v) <- states) printf("key: %s, value: %s\n", k, v)

  }
}
