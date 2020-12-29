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

  def evenOrOdd(n: Int): Unit = {
    if (n % 2 == 1) {
      println(s"$n is odd")
    } else {
      println(s"$n is even")
    }
  }

  println("---EvenOrOdd---")
  println("---Even---")
  evenOrOdd(2)
  println("---Odd---")
  evenOrOdd(5)

  def echo5(msg: String) = {
//    println(msg)
//    println(msg)
//    println(msg)
//    println(msg)
//    println(msg)
    var i = 0
    while (i < 5) {
      println(msg)
      i += 1
    }
  }

  println("---Print 5 times---")
  echo5("Hello World!")

  def count10() = {
    var i = 1
    while (i <= 10) {
      println(i)
      i += 1
    }
  }

  println("---Quick Check 5.2 Count10---")
  count10()

  def echo5ByLoop(msg: String) = {
    for (i <- 1 to 5) {
      println(msg)
    }
  }

  println("---echo5byLoop---")
  echo5ByLoop("Hello Scala!")

  def discount(price: Int) = {
    if (price >= 50 && price < 100) {
      price * 0.9
    } else if (price >= 100) {
      price * 0.85
    } else {
      price
    }
  }

  println("---Discount---")
  println(discount(80))
  println(discount(150))
  println(discount(35))

  def applyDiscount(price: Double) = {
    val discount = {
      if (price >= 100) 0.15
      else if (price >= 50) 0.10
      else 0
    }

    price * (1 - discount)
  }

  println("---applyDiscount---")
  println(applyDiscount(80))
  println(applyDiscount(150))
  println(applyDiscount(35))
}

