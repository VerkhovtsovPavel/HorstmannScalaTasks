object Main extends App{
  val cat = new Array[String](5)
  cat(0) = """ /\_/\ """
  cat(1) = """( ' ' )"""
  cat(2) = """(  -  )"""
  cat(3) = """ | | | """
  cat(4) = """(__|__)"""

  val helloScala = new Array[String](5)
  helloScala(0) = """   -----  """
  helloScala(1) = """ / Hello \"""
  helloScala(2) = """<  Scala |"""
  helloScala(3) = """ \ Coder /"""
  helloScala(4) = helloScala(0)

  val catArt = ASCIIArt(cat)
  val helloScalaArt = ASCIIArt(helloScala)

  println(catArt | helloScalaArt )
  println(catArt - helloScalaArt)
}

class ASCIIArt(private val image : Array[String]) {

  def |(other : ASCIIArt) = {
    val resultImage = new Array[String](math.max(image.length, other.image.length))
    val minLines = math.min(image.length, other.image.length)

    for(line <- 0 until minLines){
      resultImage(line) = image(line) + other.image(line)
    }
    if(minLines == image.length){
      val imageMaxLength = image.maxBy(_.length).length
      for(line <- minLines until other.image.length){
        resultImage(line) = (" "*imageMaxLength) + other.image(line)
      }
    }else{
      val otherImageMaxLength = other.image.maxBy(_.length).length
      for(line <- minLines until image.length){
        resultImage(line) = image(line) + (" "*otherImageMaxLength)
      }
    }
    ASCIIArt(resultImage)
  }

  def -(other : ASCIIArt) = {
    val resultImage = new Array[String](image.length + other.image.length)
    for(line <- image.indices){
      resultImage(line) = image(line)
    }

    for(line <- other.image.indices){
      resultImage(image.length+line) = other.image(line)
    }

    ASCIIArt(resultImage)
  }

  override def toString = image.foldLeft("")(_ + _ + "\n")
}
object ASCIIArt{
  def apply(image : Array[String]) = new ASCIIArt(image)
}
