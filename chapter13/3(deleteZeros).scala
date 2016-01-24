object Main extends App {

  val numbers = List(1,0,2,3,4,5,0,0,6,0,7)

  println(deleteZeros(numbers))
  
  def deleteZeros(list : List[Int]) : List[Int] = {
    list.filter(_!=0)
  }
}
