package example

class Person(val name: String, val age: Int = 0) {
  def presentYourself = s"My name is $name, I am $age."
}
