fun main() {
  val myName = "Filip"
  val nickname: String? = "Baban"
  val lastName: String? = null

  println(nickname)
  // val lastName: String = null doesn't work - compile time error

  // val nicknameLength = nickname!!.length // try to avoid!
  // println(nicknameLength)

  val nicknameLength = nickname?.length?.toDouble()
  println(nicknameLength)

  if (lastName != null) {
    println("My last name is ${lastName.length} characters long!")
  } else {
    println("I don't have a last name!")
  }

  if (nickname?.isEmpty() == true) {
    print("You don't have a nickname! It's length is: ${nickname.length}")
  }

  val notNullNickname = requireNotNull(lastName) // smart cast to `String`
  println(notNullNickname.capitalize())

  val myNickname = nickname ?: myName // in case I don't have a nickname, people call me by name
  println(myNickname)

  val lastBirthdayYear = 2019
  val myAge: Int? = 23

  val myAgeNotNull = myAge ?: return

  val yearOfBirth = lastBirthdayYear - myAgeNotNull
  println("I was born in $yearOfBirth")
}