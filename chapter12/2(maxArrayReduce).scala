import scala.collection.GenSeq

object Main extends App {

  val arr = Array(1,2,3,4,5,6,7)

  println(arr.reduceLeft((max,cur) => if (cur > max) cur else max ) )
}