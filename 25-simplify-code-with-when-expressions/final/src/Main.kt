fun main() {
  val myAge = 23

  println(
    when (myAge) {
      in 0..12 -> "Still a young boy!"
      in 13..19 -> "Teenager"
      in 20..29 -> "In my twenties"
      in 30..39 -> "In my thirties"
      in 40..49 -> "In my forties"
      else -> "I'm a wise man :]"
    }
  )

  val email: String? = "mail@mail.com"
  val password: String? = "iLoveKotlin!"

  when {
    email == null || email.isEmpty() -> println("You need to choose an email!")

    "@" !in email -> println("Your email is invalid :[")

    password == null || password.isEmpty() -> println("You need to choose a password!")

    password.length < 10 -> println("Password not strong enough :[")

    else -> println("Email length: ${email.length}, " +
      "Password length: ${password.length}")
  }
}