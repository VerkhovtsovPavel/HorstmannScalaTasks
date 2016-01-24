import collection.mutable
import scala.io.Source

object Main extends App {

  val string = Source.fromFile("""./VojnaIMir.Tom 1.txt""").mkString

  time {string.par.aggregate(mutable.Map[Char, Int]())((map , char) => map + ((char, map.getOrElse(char, 0) + 1)) , _ ++ _)}
  time {string.foldLeft(mutable.Map[Char, Int]())((map , char) => map + ((char, map.getOrElse(char, 0) + 1)))}

  def time[R](block: => R): R = {
    val t0 = System.currentTimeMillis()
    val result = block    // call-by-name
    val t1 = System.currentTimeMillis()
    println("Elapsed time: " + (t1 - t0) + "ms")
    result
  }
}