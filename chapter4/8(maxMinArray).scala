object Main extends App {
  val array = Array(1,2,3,4,5,6,7,8,9,10)
  
  println(findMaxMin(array));
  
  def findMaxMin(arr : Array[Int]) : (Int, Int) = {
    (arr.max, arr.min)
  }
}

