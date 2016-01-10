object Main extends App {
  val personLogger = new Person with ConsoleLogger with BufferLogger

  personLogger.log("abcd")
  personLogger.log("abcd1313")
  personLogger.log("abcd4324343")

  personLogger.log("afddd")
  personLogger.log("sfdfs1313")
  personLogger.log("afsffsf324343")
}

class Person{}

trait Logger {
  def log(msg : String)
}

trait ConsoleLogger extends Logger{
  override def log(msg : String): Unit ={
    println(msg)
  }
}

trait BufferLogger extends Logger{
  val bufferSize = 3
  var bufferCount = 0

  val buffer = new Array[String](bufferSize)

  abstract override def log(msg : String): Unit ={
    if(bufferCount < bufferSize) {
      buffer(bufferCount) = msg
      bufferCount += 1
    }
    else{
      bufferCount = 0
      for(msg <- buffer)
        super.log(msg)
    }
  }
}