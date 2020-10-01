class Person(
  val name: String,
  val lastName: String?,
  private var age: Int,
  val pet: Pet
) {

  fun getAge() = age

  fun getFullInformation(): String {
    return "Full Name: $lastName, $name, Age: $age, Pet: ${pet.name}, ${pet.animalType}"
  }
}

class Pet(var name: String, val animalType: String)

fun main() {

}