object Main extends App {
  val counter = new Counter

  for(_ <- 0 until Int.MaxValue)
     counter.increment()
  
  println(counter.current);
  
  counter.increment()
  println(counter.current);
}

class Counter{
  private var value = 0
  def increment() {value = if (value == Int.MaxValue) 0 else value+1}
  def current = value
}