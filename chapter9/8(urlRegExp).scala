import scala.collection.mutable.ArrayBuffer
import java.io._
import scala.io.Source
import java.net.URI
import java.net.URL

object Main extends App {
  val htmlSource = Source.fromURL("http://www.bsuir.by/schedule/examSchedule.xhtml?id=251001", "UTF-8").mkString

  val imgRegEx = """<img.+src=(\"[\w\d/.]+[\";])""".r

  for (imgRegEx(source) <- imgRegEx.findAllIn(htmlSource))
    println(source)
}