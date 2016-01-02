import java.io.PrintWriter

object Main extends App{
  val out = new PrintWriter("twoPowFile.txt")

  var power = BigInt(1)

  for(_ <- 0 to 20){
    out.println(power+"\t"+1/power.toDouble)
    power*=BigInt(2)
  }

  out.close()
}
