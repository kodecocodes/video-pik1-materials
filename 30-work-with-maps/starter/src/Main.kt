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
}