import scala.collection.GenSeq

object Main extends App {

  println(unless(1>2) {1 + 7})

  def unless[A](cond : Boolean)(block: => Any): Any ={
    if(!cond)
      block
  }
}