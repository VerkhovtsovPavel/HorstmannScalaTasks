import scala.collection.GenSeq

object Main extends App {
  println(largest((x) => 10 * x -x * x, 1 to 10))

  def largest(fun : (Int) => Int , inputs : Seq[Int]) = inputs.map(fun).max
}