class Square(val x : Int,val y : Int, val width : Int) extends java.awt.Rectangle(x,y,width, width){

  def this(){this (0, 0, 0)}
  
  def this(width : Int){this (0, 0, width)}
}
