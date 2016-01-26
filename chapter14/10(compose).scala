object Main extends App {

  def f(x : Double) = if (x >= 0) Some(math.sqrt(x)) else None
  def g(x : Double) = if (x != 1) Some(1 / (x - 1)) else None

  val h = compose(f, g)

  println(h(2))
  println(h(1))
  println(h(-1))

  def compose(first : (Double => Option[Double]), second : (Double => Option[Double])) = {
    (x : Double) =>
      if(first(x).isEmpty || second(x).isEmpty)
        None
      else
        second(x)
  }
}