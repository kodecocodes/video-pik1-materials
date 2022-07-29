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

fun main() {
  val age = 23

//  when(age) {
//    in 0..12 -> println("Still a young human")
//    in 13..19 -> println("Teenager")
//    in 20..29 -> println("In your twenties")
//    in 30..39 -> println("In your thirties")
//    in 40..49 -> println("In your forties")
//    else -> println("You're a wise person :]")
//  }

  val message = when(age) {
    in 0..12 -> "Still a young human"
    in 13..19 -> "Teenager"
    in 20..29 -> "In your twenties"
    in 30..39 -> "In your thirties"
    in 40..49 -> "In your forties"
    else -> "You're a wise person :]"
  }

  println(message)

  val email = "john@mail.com"
  val password = "iLoveKotlin!"

//  when {
//    email.isEmpty() -> {
//      println("You need to choose an email")
//    }
//
//    "@" !in email -> {
//      println("Your email is invalid :[")
//    }
//
//    password.isEmpty() -> {
//      println("You need to choose a password!")
//    }
//
//    password.length < 10 -> {
//      println("Password not strong enough :[")
//    }
//
//    else -> {
//      println("Email length: ${email.length}, " +
//        "Password length: ${password.length}")
//    }
//  }

  when {
    email.isEmpty() -> println("You need to choose an email!")

    "@" !in email -> println("Your email is invalid :[")

    password.isEmpty() -> println("You need to choose a password!")

    password.length < 10 -> println("Password not strong enough :[")

    else -> println("Email length: ${email.length}, " +
        "Password length: ${password.length}")
  }
}