package example

object Main extends App {

  val tom = new Robot("Tom")
  println(tom.welcome("Kenji"))

  val martin = new Person("Martin", 18)
  println(martin.presentYourself)
  val bob = new Person("Bob")
  println(bob.presentYourself)
}
