fun main() {
//  val country1 = "Russia"
//  val country2 = "USA"
//  val country3 = "Poland"
//  ... This is very exhausting and boilerplate.

  val visitedCountries = arrayOf(
    "Russia", "USA", "Poland",
    "The Netherlands", "Romania", "Greece",
    "Germany", "Spain", "Portugal",
    "Serbia", "Hungary", "Austria"
  )
  println(visitedCountries) // doesn't print the items, prints the object
  println(visitedCountries.size) // the size of the array (number of items)

  println(visitedCountries[3]) // printing a certain item

//  println(visitedCountries[20]) // crashes the app, index out of bounds
//  println(visitedCountries[-1]) // crashes the app, no negative indices

  visitedCountries + "Belgium" // Doesn't change the array, creates a new one
  println(visitedCountries.size)

  visitedCountries[1] = "The United States of America" // changes the second element (el. at index 1)
  println(visitedCountries[1])

  val sizedArray = Array(10) { "" } // 10 empty strings
  val emptyArray = emptyArray<String>() // no elements

  val arrayOfInts = intArrayOf(2, 3, 4, 5, 6, 7)
  println(arrayOfInts)

  val intArray = IntArray(10) // array of 10 zeroes
  println(intArray)

  // useful functions
  println(visitedCountries.lastIndex)
  println(visitedCountries.last())
  println(visitedCountries.first())

  val currentCountry = "Spain"
  println(visitedCountries.contains(currentCountry))

  val hasVisitedSpain = currentCountry in visitedCountries // in operator is a `contains()` check underneath.
  val hasNotVisitedSpain = currentCountry !in visitedCountries

  println(hasVisitedSpain)
  println(hasNotVisitedSpain)
}