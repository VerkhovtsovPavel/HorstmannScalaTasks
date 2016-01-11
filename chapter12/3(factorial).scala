import scala.collection.GenSeq

object Main extends App {
  println(factorialReduce(5))

  def factorialReduce(n : Int) = (1 to n).reduceLeft(_ * _)
}