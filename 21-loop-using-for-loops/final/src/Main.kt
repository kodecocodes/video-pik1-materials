fun main() {
  val visitedCountries = arrayOf(
    "Russia", "USA", "Poland",
    "The Netherlands", "Romania", "Greece",
    "Germany", "Spain", "Portugal",
    "Serbia", "Hungary", "Austria"
  )

  val rangeFromZeroToTen = 0..10 // inclusive range
  println(rangeFromZeroToTen)

  val exclusiveRange = 0 until 10
  println(exclusiveRange)

  for (index in rangeFromZeroToTen) {
    print(index)
  }

  println("")

  for (index in rangeFromZeroToTen step 2) {
    print(index)
  }

  println("")

  for (index in 10 downTo 0) { // decreasing range
    print(index)
  }

  println("")

  for (countryIndex in 0..visitedCountries.lastIndex) {
    print("${visitedCountries[countryIndex]} ")
  }

  println("")

  // a better approach, iterating over items
  for (country in visitedCountries) {
    print("$country ")
  }
}