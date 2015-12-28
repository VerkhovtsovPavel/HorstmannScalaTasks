package object random {
  var previous = BigInt(1);

  val a = BigInt(1663525)
  val b = BigInt(1013904223)
  val power = BigInt(2).pow(32)

  def nextInt(): Int = {
    previous = (previous * a + b) % power
    (previous % BigInt(Int.MaxValue)).toInt
  }

  def nextDouble(): Double = {
    previous = (previous * a + b) % power
    previous.toDouble / power.toDouble
  }

  def setSeed(seed: Int) {
    previous = seed
  }
}
package random {

}

object Main extends App {
  println(random.nextInt());
  println(random.nextInt());
  println(random.nextInt());

  println(random.nextDouble());
  println(random.nextDouble());
  println(random.nextDouble());
}