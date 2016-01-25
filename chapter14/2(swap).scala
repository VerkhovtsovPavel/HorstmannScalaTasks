object Main extends App {

  def swap(tup : (Int, Int)) = {
    tup match {
      case (x,y) => (y,x)
    }
  }

  print(swap((1,2)))
}