import scala.collection.GenSeq

object Main extends App {

  val arr = Array(1,2,3,4,5,6,7)
  val str = Array("q", "qw", "qwe", "qwer", "qwert", "qwerty", "qwertyu")

  println(str.corresponds(arr)(_.length == _))
}