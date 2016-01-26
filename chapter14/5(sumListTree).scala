object Main extends App {
  val tree = List(List(1,3), 3, List(5,6))

  print(leafSum(tree))

  def leafSum(tree : List[Any]) : Double = tree match {
     case List(x : Int, _*)=> x + leafSum(tree.tail)
     case List(l : List[Int], _*) => l.sum+leafSum(tree.tail)
     case Nil => 0
  }
}