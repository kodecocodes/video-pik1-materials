fun main() {

  val countries = arrayOf("Russia", "USA", "The Netherlands")
  val countriesList = listOf("Russia", "USA", "The Netherlands")

  println(countries)
  println(countriesList)

//  val mutableList = mutableListOf("Russia", "USA", "The Netherlands")
  val mutableList = countriesList.toMutableList() // can be changed

  mutableList.add("Germany")
  mutableList.add("Greece")

  println(mutableList)

  mutableList.addAll(listOf("Austria", "Poland", "Hungary"))
  println(mutableList)

  val hasBeenToJapan = "Japan" in mutableList
  println(hasBeenToJapan)

  mutableList.removeAll(listOf("Russia", "Japan", "USA", "Germany"))
  println(mutableList)

  mutableList[2] = "Croatia"
  println(mutableList)

  val combinedList = countriesList + mutableList // combining Lists
  println(combinedList)

  val emptyList = emptyList<String>()
  println(emptyList)
}