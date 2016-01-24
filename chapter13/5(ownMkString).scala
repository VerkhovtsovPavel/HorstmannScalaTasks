object Main extends App {

  val names = List("Paul", "Kate", "Helen")

  println(ownMkString(names, "(", ",", ")"))

  def ownMkString[A](collect : Seq[A], start : String, sep : String, finish : String) : String = {
    start + collect.foldLeft("")(_+ sep + _.toString).substring(sep.length).trim + finish
  }
}
