/**
 * This is a documentation-style comment.
 * You can reference things here, like the [main] function.
 * You can reference parameters, like the [arguments].
 * There can also hold annotations:
 * @param arguments - string arguments passed through the console.
 * */
fun main(arguments: Array<String>) {
  var myAge: Int = 23
  val name: String = "Filip"
  val lastName = "Babic"
  val weight = 63.5

  println(name)

  println("I am $myAge years old")
  myAge += 1 // adds 1 to myAge
  println("I am $myAge years old")

  println("$name $lastName is $myAge years old, and weighs $weight kg")

  val fullName = "$lastName, $name"
  println(fullName)

  // converting types
  val ageAsString = myAge.toString()
  println(ageAsString)
  val ageFromString = "35".toInt()
  println(ageFromString)

  val nameLength = fullName.length
  println(nameLength)

  // Single line comment, useful for marking sections
  // You can also split them in mutliple lines

  /* This is a multiline comment.
     You don't have to add // before
     each line.

     /*
       You can also nest multiline comments.
     */
   */
}