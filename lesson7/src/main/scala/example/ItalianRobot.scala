package example

class ItalianRobot(name: String, country: String) extends Robot(name) {
    override def welcome(n: String) = s"Benvenuto $n!"
}