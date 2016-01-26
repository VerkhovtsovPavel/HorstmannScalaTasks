object Main extends App {
  val tree = Node('+', Node('*', Leaf(3), Leaf(8)),  Leaf(2), Node('-', Leaf(3), Leaf(5)))

  print(tree.leafSum())
}

sealed abstract class BinaryTree{
  def leafSum(tree : BinaryTree = this) : Double = tree match {
    case Leaf(x) => x
    case Node('+', child @ _*) => child.foldLeft(0.0)(_ + leafSum(_))

    case Node('-', Leaf(x)) => -x
    case Node('-', Leaf(firstChild), otherChild @ _*) => otherChild.foldLeft(firstChild.toDouble)(_ - leafSum(_))

    case Node('*', child @ _*) => child.foldLeft(1.0)(_ * leafSum(_))
  }
}
case class Leaf(value : Int) extends BinaryTree
case class Node(operator : Char, children : BinaryTree*) extends BinaryTree