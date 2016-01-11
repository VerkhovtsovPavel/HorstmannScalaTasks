  val dollar = Money(1, 0)
  val tenCents = Money(0, 10)

  println(dollar - tenCents)
  println(tenCents - dollar)
  println(tenCents + dollar)

  println(dollar < tenCents)
  println(tenCents + dollar == Money(1, 10))
}

class Money(d : Int, c: Int) {
  private val dollar : Int = (d * 100 + c) / 100
  private val cent : Int = (d * 100 + c) % 100

  override def toString = {
    val prefix = if(dollar < 0 || cent < 0) "-" else ""
    prefix + math.abs(dollar) + "$ " + math.abs(cent) + "¢"}

  def +(other : Money) = Money(dollar + other.dollar , cent + other.cent)
  def -(other : Money) = Money(dollar - other.dollar , cent - other.cent)

  def ==(other : Money) = dollar*100+cent == other.dollar*100 + other.cent
  def <(other : Money) = dollar*100+cent < other.dollar*100 + other.cent
}
object Money{
  def apply(d : Int, c: Int) = new Money(d, c)
}