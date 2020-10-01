fun main() {
  val isProgrammingAwesome = true // false

  println("Is programming awesome? $isProgrammingAwesome")

  val myAge = 23
  val country = "Croatia"

  val isLegalDrivingAge =
    (country == "Croatia" && myAge >= 18) || (country == "USA" && myAge >= 16)

  println(isLegalDrivingAge)

  if (isLegalDrivingAge) {
    println("You can drive!")
  } else {
    println("You've got a bit more time to go!")
  }

  if (myAge >= 18) println("I'm an adult!") else println("I'm still underaged!")

  println(if (myAge >= 18) "I'm an adult" else "I'm still underaged")
}