fun main() {
//  val name = "Filip"
//  val lastName = "Babic"
//  val age = 23

  val birthday = Triple(11, 12, 1996)
  val person = Pair("Filip Babic", birthday) // nested pairs/triples

  val nameUsingOrdering = person.first
  val birthDayUsingOrdering = person.second

  val (name, bday) = person
  val (dayOfBirth, birthMonth, _) = bday
  val yearOfBirth = birthDayUsingOrdering.third

  println("$name was born on $dayOfBirth/$birthMonth, year unknown!")
}