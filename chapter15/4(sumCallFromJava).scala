import scala.annotation.varargs

object Main extends App {
  @varargs def sum(args : Int*) = {
    args.sum
  }
}