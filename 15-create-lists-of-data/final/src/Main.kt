fun main() {

  val countries = arrayOf("Russia", "USA", "The Netherlands")
  val countriesList = listOf("Russia", "USA", "The Netherlands")

  println(countries)
  println(countriesList)

//  val mutableList = mutableListOf("Russia", "USA", "The Netherlands")
  val mutableList = countriesList.toMutableList() // can be changed

  mutableList.add("Germany")
  mutableList.add(1, "Greece")

  println(mutableList)

  mutableList.addAll(listOf("Austria", "Poland", "Hungary")) // or addAll(index, items)
  println(mutableList)

  val hasBeenToJapan = "Japan" in mutableList
  println(hasBeenToJapan)

  mutableList.remove("Japan")
  mutableList.removeAt(0)
  mutableList.removeAll(listOf("Russia", "Japan", "USA", "Germany"))
  println(mutableList)

  mutableList[2] = "Croatia"
  val combinedList = countriesList + mutableList // combining Lists
  val emptyList = emptyList<String>()

  println(mutableList)
  println(combinedList)
  println(emptyList)

  mutableList.clear()
  println(mutableList)
}