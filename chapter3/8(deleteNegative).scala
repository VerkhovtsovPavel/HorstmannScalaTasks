import scala.collection.mutable.ArrayBuffer

object Main extends App{
    val arr = ArrayBuffer[Int](7,2,3,5,-4,6,1, 2 ,-3 ,4 ,5, -9);
    var negativeIndexs = ArrayBuffer[Int]()
    
    for(index <- 0 until arr.length){
     if(arr(index)<0)
       negativeIndexs.append(index)
    }
    
    negativeIndexs = negativeIndexs.tail.reverse
    
    for(nIndex <- negativeIndexs)
      arr.remove(nIndex);
    
    print(arr);
}