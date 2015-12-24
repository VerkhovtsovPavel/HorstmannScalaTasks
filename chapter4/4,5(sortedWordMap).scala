import scala.collection.JavaConversions.mapAsScalaMap

object Main extends App{
  val in = new java.util.Scanner(new java.io.File("myfile.txt"));
  
  var result : scala.collection.mutable.Map[String, Int] = new java.util.TreeMap[String, Int];
  
  while(in.hasNext()){
    val current = in.next();
    val preResult = result.getOrElse(current, 0);
    result+=(current -> (preResult+1))
  }
  
  println(result);
  
}