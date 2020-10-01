class Person(
  private val name: String,
  private val lastName: String?,
  private var age: Int,
  val pet: Pet
) {

  fun setAge(age: Int) {
    if (age in 0..150) {
      this.age = age
    } else {
      // invalid age!
    }
  }

  fun getAge() = age

  fun getFullInformation(): String {
    return "Full Name: $lastName, $name, Age: $age, Pet: ${pet.name}, ${pet.animalType}"
  }
}

class Pet(var name: String, val animalType: String)

fun main() {
  var dog = Pet("Jura", "Goldie/Husky/Labrador Mix!")
  val filip = Person("Filip", "Babic", 23, dog)

  println(filip.getFullInformation())

  filip.setAge(75)
  println(filip.getAge())

  println(filip.pet.name)

  dog.name = "Scratchy"
  println(filip.pet.name)

  dog = Pet("Jura", "Goldie")
  println(filip.pet.name)
}