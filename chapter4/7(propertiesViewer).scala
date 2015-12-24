import scala.collection.JavaConversions.propertiesAsScalaMap
import scala.collection.mutable.Map;
object Main extends App {
  val properties: Map[String, String] = System.getProperties();
  val longerKeyLength = properties.keys.maxBy[Int](_.length()).length()
  
  for((k,v) <-properties){
    printf("%-"+longerKeyLength+"s | %s\n", k, v);
  }
}