import scala.collection.GenSeq

object Main extends App {

  val arr = Array(1,2,3,4,5,6,7)

  println(factorialReduce(5))
  
  def factorialFold(n : Int) = (1 to n).foldLeft(1)(_ * _)
}