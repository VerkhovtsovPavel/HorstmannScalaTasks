import scala.collection.mutable.{HashMap => ScalaHashMap}
object Main extends App {
  import java.util.{HashMap => JavaHashMap}
  val javaHash = new JavaHashMap[String, Int]();
  javaHash.put("one", 1);
  javaHash.put("two", 2);
  javaHash.put("three", 3);

  import scala.collection.mutable.{HashMap => ScalaHashMap}
  val scalaHash = ScalaHashMap[String, Int]();
  
  import scala.collection.JavaConversions._
  for(item <-javaHash.entrySet().iterator()){
    scalaHash.put(item.getKey, item.getValue)
  }
  
  println(scalaHash);
}