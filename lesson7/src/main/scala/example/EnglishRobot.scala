package example

class EnglishRobot(name: String, country: String) extends Robot(name) {

    override def welcome(n: String) = s"Welcome $n from the country of $country"
}