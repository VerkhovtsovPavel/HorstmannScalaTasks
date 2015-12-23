import scala.collection.mutable.ArrayBuffer

object Main extends App{
    val arr = Array[Int](7,2,3,5,4,6,1);
    val reverseArr = arr.sortWith(_<_).reverse
    
    for(item <- reverseArr)
      print(item+" ");
    
    
    val arrBuff = ArrayBuffer[Int](7,2,3,5,4,6,1);
    val reverseArrBuff = arrBuff.sortWith(_<_).reverse
    
    for(item <- reverseArrBuff)
      print(item+" ");
}