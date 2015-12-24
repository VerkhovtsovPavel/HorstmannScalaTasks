import scala.collection.mutable.ArrayBuffer
import java.awt.datatransfer._

object Main extends App{
    val flavors = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]
    
    val result = flavors.getNativesForFlavor(DataFlavor.imageFlavor)
    
    println(result);
}