import scala.collection.mutable.ArrayBuffer

object Main extends App{
    val arr = java.util.TimeZone.getAvailableIDs();
    
    var result = ArrayBuffer[String]();
    
    for(item <- arr if item.startsWith("America/")){
      result.append(item.replace("America/", ""))
    }
     result = result.sorted;
    
    println(result);
}