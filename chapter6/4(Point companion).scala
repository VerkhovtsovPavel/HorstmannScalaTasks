object Main extends App{
  val points = Array(new Point(0,0), Point(2, 5), Point (12,15))
}

class Point(var x: Int, var y: Int){
  def transform (dx : Int, dy: Int): Unit ={
    x+=dx
    y+=dy
  }
}

object Point{
  def apply(x : Int, y: Int) = new Point(x, y)
}
