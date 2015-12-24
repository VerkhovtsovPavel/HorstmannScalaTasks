object Main extends App {
  val array = Array(1,2,3,4,5,6,7,8,9,10)
  
  println(lteqgt(array, 5));
  
  def lteqgt(arr : Array[Int], v : Int) : (Int, Int, Int) = {
    var lest = arr.filter(_<v).size;
    var equals = arr.filter(_==v).size;
    var great = arr.filter(_>v).size;
       
    (lest, equals, great)
  }
}
