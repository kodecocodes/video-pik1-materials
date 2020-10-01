fun main() {
  // key - genre, value - list of game names
  val videoGamesCollection = mutableMapOf<String, MutableList<String>>() // mutable map

  // can also use map.put(key, value)
  videoGamesCollection["Action"] = mutableListOf("Dark Souls", "Sekiro: Shadows Die Twice")

  println(videoGamesCollection)

  val actionGames = videoGamesCollection["Action"]
  println(actionGames)

  // using get notation
  val strategyGames = videoGamesCollection.get("Strategy")
  println(strategyGames)

  // using predefined pairs
  val authenticationHeaders = mapOf(
    "API_KEY" to "your-api-key",
    "Authorization" to "auth token",
    "content/type" to "application/json"
  )

  println(authenticationHeaders)

  // ---

  videoGamesCollection["Strategy"] = mutableListOf()
  println(videoGamesCollection)

  videoGamesCollection["Strategy"] = mutableListOf("Heroes of Might & Magic 3")
  println(videoGamesCollection)

  videoGamesCollection["Strategy"]?.add("Civilisation VI")
  println(videoGamesCollection)

  val removedActionGames = videoGamesCollection.remove("Action")
  println(removedActionGames)
  println(videoGamesCollection)

  // can only update mutable maps
//  authenticationHeaders["Authorization"] = "new-api-key" compile time error

  videoGamesCollection["Strategy"]?.add("Command & Conquer")
  videoGamesCollection["Shooter"] = mutableListOf("DOOM")

  for (key in videoGamesCollection.keys) {
    println(key)
  }

  for (value in videoGamesCollection.values) {
    println(value)
  }

  for (entry in videoGamesCollection) {
    val (key, value) = entry
    // ...
  }
  for ((key, value) in videoGamesCollection) {
    println("Video games in the $key genre you own are: $value")
  }

  val map = mapOf("Strategy" to mutableListOf("HoMM3", "Civilisation VI"))
  map["Strategy"]?.add("Command & Conquer")
}
