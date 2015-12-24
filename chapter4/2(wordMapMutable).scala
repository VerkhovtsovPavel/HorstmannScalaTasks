import scala.collection.mutable.HashMap
object Main extends App{
  val in = new java.util.Scanner(new java.io.File("myfile.txt"));
  
  val result = new HashMap[String, Int]()
  
  while(in.hasNext()){
    val current = in.next();
    val preResult = result.getOrElse(current, 0);
    result.put(current, preResult+1)
  }
  
  println(result);
  

}