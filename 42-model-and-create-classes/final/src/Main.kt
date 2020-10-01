class Person(
  val name: String,
  val lastName: String?,
  var age: Int
)

class Empty

fun main() {
  val filip = Person("Filip", "Babic", 23)
  val marin = Person("Marin", null, 23)

  println(filip)
  println("Name: ${filip.name}, Last name: ${filip.lastName}, Age: ${filip.age}")
  println("Name: ${marin.name}, Last name: ${marin.lastName}, Age: ${marin.age}")

  val filipClone = filip

  filipClone.age = 24
  println(filip.age)
  println(filipClone.age)

  val filipTwo = Person("Filip", "Babic", 24)

  println(filip == marin)

  println(filip == filipClone)
  println(filip === filipClone)

  println(filipTwo === filip)
}