object Main extends App {
  val personLogger = new Person with ConsoleLogger with CryptoLogger

  personLogger.log("abcd");
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

trait CryptoLogger extends Logger{
  var key = 3
  val base = 26

  def setKey(newKey : Int){ key = newKey}

  abstract override def log(msg : String): Unit ={
    var cryptoStr = ""
    for(c <- msg.toCharArray)
      cryptoStr+=(((c-'a'+26+key) % base)+'a').toChar

    super.log(cryptoStr)
  }
}

