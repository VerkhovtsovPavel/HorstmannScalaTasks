import java.io.File

object Main extends App { 
  
  val dirHier = subdirs(new File("""D:\University\CourseProject\source\bin\by\bsuir\verkpavel\courseproject"""))
  
  var classFileCounter = 0
  
  for(d <- dirHier){
    classFileCounter+=d.listFiles().filter(_.getName.endsWith(".class")).length
  }
  
  println("Count class files "+classFileCounter)
  
  def subdirs(dir : File) : Iterator[File] = {
    val child = dir.listFiles().filter(_.isDirectory())
    child.toIterator ++ child.toIterator.flatMap(subdirs(_))
  } 
}