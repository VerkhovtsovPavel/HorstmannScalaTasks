object Main extends App {

  println(values(_ * 2, 0, 12))

  def values(fun: (Int) => Int, low: Int, high: Int) = {
    for (current <- low to high) yield (current, fun(current))
  }
}