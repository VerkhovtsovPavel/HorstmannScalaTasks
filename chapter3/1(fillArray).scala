import scala.collection.mutable.ArrayBuffer;
object Main extends App{
   val n = 20; 
   var arr = ArrayBuffer[Int]();
   for(i <- 0 until n)
     arr+=i
     
   print(arr);  

}