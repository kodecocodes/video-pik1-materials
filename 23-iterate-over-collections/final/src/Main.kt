fun main() {
  val daysOfWeek = listOf(
    "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
  )

  for (day in daysOfWeek) {
    if (day == "Monday") {
      continue
    }

    println("Working!")

    if (day == "Thursday") {
      println("Get ready for the weekend")
      break
    }
  }

  // String matrix - A List of List of Strings
  val matrix = MutableList<MutableList<String>>(5) { MutableList(5) { "" } }

  for (row in 0..matrix.lastIndex) {
    label@ for (column in 0..matrix.lastIndex) {
      matrix[row][column] = "$row:$column"
    }
  }

  println(matrix)

  println("------")

  for (row in matrix) {
    println(row)
  }

  val thirdRowFifthColumnElement = matrix[2][4]
  println(thirdRowFifthColumnElement)

  // nested loops, useful for passing through two-layer constructs (matrix)
  row@ for (row in 0..5) {

    column@ for (column in 0..5) {
      if (column == 2 && row == 2) {
        break@row
      }
      print("x\t")
    }
    println()
  }
}
