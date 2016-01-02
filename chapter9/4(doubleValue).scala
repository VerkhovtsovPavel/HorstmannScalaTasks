import scala.io.Source

object Main extends App{
  val data = for (d <-Source.fromFile("sample.txt", "UTF-8").mkString.split("\\s+")) yield d.toDouble

  println("Max: "+data.max)
  println("Min: "+data.min)
  println("Mid: "+data.sum/data.length)
  println("Sum: "+data.sum)
}
