package example

class Teacher(name: String, age: Int) extends Person(name, age) {
    override def hello(n: String): String = s"Hello, $n! My name is $name. I am $age."
}