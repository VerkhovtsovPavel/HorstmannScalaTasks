object Main extends App {
  val tree = Node(Leaf(2), Node(Leaf(3), Leaf(5)), Leaf(10))

  print(tree.leafSum())
}

sealed abstract class BinaryTree{
  def leafSum(tree : BinaryTree = this) : Double = tree match {
    case Leaf(x) => x
    case Node(child @ _*) => child.foldLeft(0.0)(_ + leafSum(_))
  }
}
case class Leaf(value : Int) extends BinaryTree
case class Node(children : BinaryTree*) extends BinaryTree