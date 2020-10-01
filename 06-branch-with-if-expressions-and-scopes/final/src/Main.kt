fun main() {
  val myAge = 23

  println(if (myAge >= 18) "I'm an adult" else "I'm still underaged")

  if (myAge >= 18) {
    val country = "Croatia"

    if (country == "USA") {
      println("You're allowed to drive, but not to drink!")
    } else if (country == "Croatia") {
      println("You're allowed to both drink and drive (not at the same time)!")
    }
  }

  // country.length unresolved reference 'country'

  val yearOfBirth = 1996

  val generationCohort = if (yearOfBirth > 1964 && yearOfBirth < 1980) {
    "Generation X"
  } else if (yearOfBirth > 1979 && yearOfBirth < 1995) {
    "Millenial"
  } else {
    "Generation Z"
  }

  println(generationCohort)
}