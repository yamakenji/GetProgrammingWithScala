package example

object Main extends App {

  // val tom = new Robot("Tom")
  // println(tom.welcome("Kenji"))

  // val martin = new Person("Martin", 18)
  // println(martin.presentYourself)
  // val bob = new Person("Bob")
  // println(bob.presentYourself)

  println("---Lesson7.2---")

  val name: String = "Kenji"
  val italian = new ItalianRobot("Italian", "Italy")
  println(italian.welcome(name))
  val american = new EnglishRobot("American", "USA")
  println(american.welcome(name))

  // println("---Quick Check 7.2---")
  // val teacher = new Teacher("Martin", 50)
  // println(teacher.presentYourself)
  // val student = new Student("Bob", 15)
  // println(student.presentYourself)

  println("---Quick Check 7.3---")
  val teacher = new Teacher("Martin", 50)
  val student = new Student("Bob", 15)
  println(teacher.hello("Bob"))
  println(student.hello("Martin"))

  println("7.3 TRY THIS")

  val icedCoffee = new ColdBeverage("Coffee")
  val hotTea = new HotBeverage("Tea")

  println(icedCoffee.requst())
  println(hotTea.requst())
}
