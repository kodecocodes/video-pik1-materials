fun main() {
  val isProgrammingAwesome = true // false

  println("Is programming awesome? $isProgrammingAwesome")

  val myAge = 23

  val isLegalDrivingAge = myAge >= 18
  println(isLegalDrivingAge)

  val ageTim = 27
  val isTimOlder = ageTim > myAge
  println(isTimOlder)

  val yearOfBirth = 1996

  val isBornInTwentiethCentury = yearOfBirth < 2000
  println(isBornInTwentiethCentury)

  val strangerName = "Tim"
  val myName = "Filip"

  val isSameName = strangerName == myName
  println(isSameName)

  val areNamesDifferent = myName != strangerName
  println(areNamesDifferent)

  val firstObject = Any()
  val secondObject = Any()

  println(firstObject === secondObject)
  println(firstObject !== secondObject)

  val isNameEmpty = myName.isEmpty()
  println(isNameEmpty)
}