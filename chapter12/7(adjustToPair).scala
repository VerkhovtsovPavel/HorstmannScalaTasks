import scala.collection.GenSeq

object Main extends App {

  println(adjustToPair(_ * _)((6, 5)))

  def adjustToPair(fun : (Int, Int) => Int) : (((Int, Int)) => Int) = {
    (tuple :(Int, Int)) => fun(tuple._1, tuple._2)
  }
}