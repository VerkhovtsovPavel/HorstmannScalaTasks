import java.io.PrintWriter
import scala.io.Source

object Main extends App{
  val source = Source.fromFile("sample.txt", "UTF-8")

  val lines = source.mkString.replaceAll("\\t","   ")

  val out = new PrintWriter("sample.txt")
  out.print(lines)
  out.close()
}
