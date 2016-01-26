object Main extends App {
  val optList = List(Some(5), Some(10), None, Some(3), Some(2))

  println(optList.flatten.sum)
}