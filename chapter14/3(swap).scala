object Main extends App {

  def swap(arr : Array[Any]) = {
    arr match {
      case Array(x, y) => Array(y, x)
      case Array(x, y, tail) => Array(y, x, tail)
      case _ => arr
    }
  }

  println(swap(Array(1)).mkString(" "))
  println(swap(Array(1,2)).mkString(" "))
  println(swap(Array(1,2,3)).mkString(" "))
  println(swap(Array(1,2,3,4)).mkString(" "))
}