object Main extends App {
//  println("Hello, World!")

  var marksSum = 0
  var marksCount = 0

  def averageMark: Double = marksSum.toDouble / marksCount

  //  def markExam(q1: Double, q2: Double, q3: Double) = Math.round(((q1 + q2 + q3) / 3) * 10 / 3)

  def markExam(q1: Double, q2: Double, q3: Double): Int = {
    val avgScore = (q1 + q2 + q3) / 3
    val scaledScore = avgScore * 10 / 3
    val mark = Math.round(scaledScore).toInt

    marksSum += mark
    marksCount += 1
    mark

  }

//  println("---markExam---")
//  println(markExam(1.5, 2, 2.5))
  println("---markExam more readable---")
  println(markExam(1.5, 2, 2.5))
}
