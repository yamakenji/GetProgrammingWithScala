object Main extends App {

  def categorizeDayOfWeek(n: Int) = {
    if (n == 1 || n == 7) {
      "Weekend"
    } else if (n > 1 && n < 7) {
      "Weekday"
    } else {
      "Unknown"
    }
  }

  println("---Weekend---")
  println(categorizeDayOfWeek(1))
  println("---Weekday---")
  println(categorizeDayOfWeek(3))
  println("---Unknown---")
  println(categorizeDayOfWeek(10))

  def label(n: Int) = {
    if (n == 0) "Natural"
    else if (n < 0) "Negative"
    else "Positive"
  }

  println("---Natural---")
  println(label(0))
  println("---Negative---")
  println(label(-5))
  println("---Positive---")
  println(label(10))
}
