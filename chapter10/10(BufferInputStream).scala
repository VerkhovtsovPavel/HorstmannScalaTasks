import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn

class IterableInputStream extends java.io.InputStream with Iterable[Byte] {
  val buffer = new ArrayBuffer[Byte]()


  override def read(): Int = {
    val value = StdIn.readInt()
    buffer.append(value.toByte)
    value
  }

  override def iterator: Iterator[Byte] = buffer.iterator
}
