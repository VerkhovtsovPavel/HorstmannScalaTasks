import java.io.File

object Main extends App {
  val file = new File("d:\\HorstmannScalaTasks\\chapter9\\9(classFiles).scala")
  val RichFile(path, name, ext) = file

  println(path)
  println(name)
  println(ext)
}

object RichFile  {
  def unapply(file : File) = {
    val fullPath = file.getAbsolutePath
    val slash = fullPath.lastIndexOf("""\""")
    val `.` = fullPath.lastIndexOf(".")
    val path = fullPath.substring(0, slash)
    val name = fullPath.substring(slash+1, `.`)
    val ext = fullPath.substring(`.`+1)

    Some((path, name, ext))
  }

  def unapplySeq(file : File) : Option[Seq[String]] = {
    val fullPath = file.getAbsolutePath
    Some(fullPath.split("""/"""))
  }
}