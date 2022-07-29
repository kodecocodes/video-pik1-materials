/*
 * Copyright (c) 2022 Razeware LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * Notwithstanding the foregoing, you may not use, copy, modify, merge, publish,
 * distribute, sublicense, create a derivative work, and/or sell copies of the
 * Software in any work that is designed, intended, or marketed for pedagogical or
 * instructional purposes related to programming, coding, application development,
 * or information technology.  Permission for such use, copying, modification,
 * merger, publication, distribution, sublicensing, creation of derivative works,
 * or sale is expressly withheld.
 *
 * This project and source code may use libraries or frameworks that are
 * released under various Open-Source licenses. Use of those libraries and
 * frameworks are governed by their own individual licenses.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

/*
Challenge 1:

Create a function which takes in two parameters - a name and a last name.
Because not everyone has a last name,
leave the lastName parameter to be an empty String if it is not passed in.

Then return the length of the person's full name is.


Challenge 2:

Overload the function from the first challenge, by adding a list of Strings parameter, for middle names,
in case someone has one or more middle names.

Use the function to return the full name length, for a name with and without middle names.
Remember to use named arguments if needed.
 */

fun main() {
  fun getFullNameLength(name: String, lastName: String = "") =
    name.length + lastName.length

  fun getFullNameLength(name: String, middleName: String = "", lastName: String = ""): Int {
    return name.length + middleName.length + lastName.length
  }

  val nameLength = getFullNameLength("Ayo", "Balogun")
  println(nameLength)

  val length = getFullNameLength("Damini", "Ebunoluwa", "Ogulu")
  println(length)
}