object Main extends App {
  // println("Hello, World!")

  def isEven(n: Int): Boolean = {
    n % 2 == 0
  }

  println("--- isEven ---")
  println("--- 123 ----")
  println(isEven(123))
  println("--- 1024 ----")
  println(isEven(1024))

  def pow(exponent: Int, base: Int): Double = {
    Math.pow(base, exponent)
  }

  println("--- Lesson6 Try this ---")
  println(pow(3, 2))
}
