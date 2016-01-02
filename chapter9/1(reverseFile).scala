import scala.io.Source

object Main extends App{
  val source = Source.fromFile("sample.txt", "UTF-8")

  val lines = source.getLines().toArray.reverse

  for(line <- lines)
    println(line)
}
