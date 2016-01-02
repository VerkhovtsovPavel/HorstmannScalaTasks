abstract class Shape(val x : Int, val y : Int){
  def centerPoint : (Int, Int)
}

class Rectangle(x : Int, y: Int, val heigth : Int, val weigth : Int) extends Shape(x,y) {
  override def centerPoint  = ((x+heigth) /2 , (y+weigth)/2)
}

class Circle(x : Int, y: Int, val radius : Int) extends Shape(x,y) {
  override def centerPoint  = (x , y)
}