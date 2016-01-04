import scala.io.Source

object Main extends App { 
  val regExp = """\d+\.\d+"""
  
  val words = Source.fromFile("myfile.txt").mkString.split(" ")

  for(word <- words if !word.matches(regExp))
    println(word)
      
}