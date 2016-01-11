import scala.collection.GenSeq

object Main extends App {

  val arr = Array(1,2,3,4,5,6,7)
  val str = Array("q", "qw", "qwe", "qwer", "qwert", "qwerty", "qwertyu")

  println(corresponds[String, Int](str, arr,_.length == _))

  def corresponds[A,B](one : GenSeq[A], two: GenSeq[B], p: (A,B) => Boolean): Boolean = {
    val i = one.iterator
    val j = two.iterator
    while (i.hasNext && j.hasNext)
      if (!p(i.next(), j.next()))
        return false

    !i.hasNext && !j.hasNext
  }
}