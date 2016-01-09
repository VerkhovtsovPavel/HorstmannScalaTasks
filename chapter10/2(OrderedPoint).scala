import java.awt.Point

object Main extends App {
  val point1 = new OrderedPoint(10, 20)
  val point2 = new OrderedPoint(10, 20)

  println(point1 == point2)

}

class OrderedPoint(x : Int, y: Int) extends java.awt.Point(x, y) with Ordered[java.awt.Point] {
  override def compare(that: Point): Int = {
    if(this.x > that.x || (this.x == that.y && this.y > that.y))
      1
    else if(this.x == that.y && this.y == that.y)
      0
    else
      -1
  }
}
