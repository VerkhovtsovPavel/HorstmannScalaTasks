import scala.collection.immutable.HashMap
object Main extends App{
  val in = new java.util.Scanner(new java.io.File("myfile.txt"));
  
  var result = new HashMap[String, Int]()
  
  while(in.hasNext()){
    val current = in.next();
    val preResult = result.getOrElse(current, 0);
    result+=(current -> (preResult+1))
  }
  
  println(result);
  

}