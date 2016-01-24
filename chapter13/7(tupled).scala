object Main extends App {

  val prices = List[Int](15000, 10000, 500)
  val quantities = List[Int](3, 4, 2)

  val total = (prices zip quantities) map {((a : Int, b : Int) => a * b).tupled}

  print(total)
}

