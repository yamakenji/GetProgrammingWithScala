package example

// class Robot(val name: String = "Unknown") {
  // def welcome(n: String) = s"Welcome $n! My name is $name"
// }

// Lesson7.3 Abstract class

abstract class Robot(name: String) {
  def welcome(n: String): String
}
