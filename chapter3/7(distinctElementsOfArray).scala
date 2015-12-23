import scala.collection.mutable.ArrayBuffer

object Main extends App{
    val arr = Array[Int](7,2,3,5,4,6,1, 2 ,3 ,4 ,5, 9);
    
    for(item <- arr.distinct)
      print(item+" ");  
}