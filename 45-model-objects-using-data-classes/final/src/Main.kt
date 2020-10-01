data class Person(
  val name: String,
  val lastName: String?,
  val age: Int,
  val pet: Pet
)

data class Pet(val name: String, val animalType: String)

fun main() {
  val dog = Pet("Max", "Germand Shepard Dog")
  val filip = Person("Filip", "Babic", 23, dog)

  println(filip)

  val olderFilip = filip.copy(age = filip.age + 20)
  println(olderFilip)

  val (name, _, age, pet) = olderFilip
  println(pet)

  val firstName = olderFilip.component1()
  println(firstName)

  var filipTwo = filip
  println(filipTwo == filip)
  println(filipTwo === filip)

  filipTwo = filip.copy()
  println(filipTwo == filip)
  println(filipTwo === filip)
}