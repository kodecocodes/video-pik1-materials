fun main() {
  val visitedCountries = arrayOf(
    "Russia", "USA", "Poland",
    "The Netherlands", "Romania", "Greece",
    "Germany", "Spain", "Portugal",
    "Serbia", "Hungary", "Austria"
  )
  var i = 15

  // checks the condition, then exits -> won't print for i = 15
  while (i < visitedCountries.size) {
    println("Country at index $i is: ${visitedCountries[i]}")
    i += 1
  }

  println("------")

  i = 0

  // first executes, then checks the condition, if i = 15, it will crash due to faulty index
  do {
    println("Country at index $i is: ${visitedCountries[i]}")
    i += 1
  } while (i < visitedCountries.size)
}