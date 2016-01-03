import scala.io.Source

object Main extends App{
  val regExp = "\".+\"".r

  val text = Source.fromFile("EntityShowView.java").mkString

  for(item <- regExp.findAllIn(text).toArray)
    println(item)
}
