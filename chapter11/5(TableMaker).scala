object Main extends App{
  val html = new Table() | "Java" | "Scala" || "Gosling" | "Odersky" || "JVM" | "JVM, .NET"

  println(html)
}

class Table(private val htmlText : String = "<table><tr></tr></table>") {
  def |(text : String) = {
    val insertPosition = htmlText.lastIndexOf("</tr>")
    Table(htmlText.substring(0, insertPosition) + "<td>" + text + "</td>" + htmlText.substring(insertPosition, htmlText.length))
  }
  def ||(text : String) = {
    val insertPosition = htmlText.lastIndexOf("</table>")
    Table(htmlText.substring(0, insertPosition) + "<tr>"+ "<td>" + text + "</td>" +"</tr>" + htmlText.substring(insertPosition, htmlText.length))
  }

  override def toString = htmlText
}
object Table{
  def apply(htmlText : String = "<table><tr></tr></table>") = new Table(htmlText)
}
