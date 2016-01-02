object Main extends App {
  val point = new Point(10, 30)
  val labeledPoint = new LabeledPoint("Label", 30, 50)

  println(point.toString())
  println(labeledPoint.toString())
}

class Point(val x : Int, val y : Int){

  override def toString() = { "Point x="+x+" y="+y }
}

class LabeledPoint(val text : String, x : Int, y : Int) extends Point(x, y) {

  override def toString() = { "LabeledPoint text="+text+" x="+x+" y="+y }
}
