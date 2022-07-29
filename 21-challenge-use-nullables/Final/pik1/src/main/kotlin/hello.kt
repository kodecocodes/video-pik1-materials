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
Challenge:
Declare a variable of type String? called `password` and assign a value to it.

Using an if expression, check the level of password strength,
and assign an appropriate message to another constant named `message`.

Then print out the message.

Levels are designed as follows:

0 characters or `null` -> “Ehm, you need a password to keep safe!”
1-5 characters -> “Weak password! Try adding a few more symbols to it!”
6-10 characters -> “Medium-strength password.”
11-15 characters -> “No one is getting through this!”
15+ characters -> "Ironclad
 */

fun main() {
  val password: String? = null
  val passwordLength = password?.length ?: 0

  val message = if (passwordLength == 0) {
    "Ehm, you need a password to keep safe!"
  } else if (passwordLength in 1..5) {
    "Weak password! Try adding a few more symbols to it!"
  } else if (passwordLength in 6..10) {
    "Medium-strength password."
  } else if (passwordLength in 11..15) {
    "No one is getting through this!"
  } else {
    "Ironclad"
  }

  println(message)
}