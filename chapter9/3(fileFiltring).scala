import scala.io.Source

object Main extends App{
  Source.fromFile("sample.txt", "UTF-8").mkString.split("[ \n]+").filter(_.length>=12).foreach(println)
}
