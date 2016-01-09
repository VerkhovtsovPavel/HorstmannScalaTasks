import java.awt.geom.Ellipse2D

object Main extends App{
  val egg = new Ellipse2D.Double(5, 10, 20, 30) with TranslateGrow {
    override def setX(value: Int): Unit = {x=value}

    override def setY(value: Int): Unit = {y=value}

    override def setWidth(value: Int): Unit = {width=value}

    override def setHeight(value: Int): Unit = {height=value}
  }

  egg.translate(10, -10)
  egg.grow(10, 20)

}

trait TranslateGrow{

  def setX(value: Int)
  def getX : Int

  def setY(value: Int)
  def getY : Int

  def setHeight(value: Int)
  def getHeight :Int

  def setWidth(value: Int)
  def getWidth : Int

  def translate(dX : Int, dY : Int): Unit = {setX(getX+dX); setY(getY+dY)}
  def grow(dH : Int, dW : Int): Unit = {setHeight(getHeight+dH); setWidth(getWidth+dW)}
}