object Main extends App {

  val numbers = Array(1, 2, 3, 4, 5, 6)

  print(toMatrix(numbers, 3).foldLeft("")(_ + _.mkString(", ") + "\n"))

  def toMatrix(array : Array[Int], columns : Int) = {
    numbers.grouped(columns).foldLeft(List[Array[Int]]())(_ :+ _).toArray
  }
}
