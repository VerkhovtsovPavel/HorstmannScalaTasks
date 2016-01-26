object Main extends App {
  val tree = Node(Leaf(2), Node(Leaf(3), Leaf(5)))

  print(tree.leafSum())
}

sealed abstract class BinaryTree{
  def leafSum(tree : BinaryTree = this) : Double = tree match {
    case Leaf(x) => x
    case Node(l, r) => leafSum(l) + leafSum(r)
  }
}
case class Leaf(value : Int) extends BinaryTree
case class Node(left : BinaryTree, right: BinaryTree) extends BinaryTree