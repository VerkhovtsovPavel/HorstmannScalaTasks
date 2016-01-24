object Main extends App {

  val names = List("Paul", "Kate", "Helen")
  val ages = Map("Paul" -> 22, "Kate" -> 20)

  println(stringToInt(names, ages).foldLeft("")(_+_.toString+" ").trim)

  def stringToInt(strings : List[String], strToInt : Map[String, Int]) : Array[Int] = {
    strings.flatMap(strToInt.get(_)).toArray
  }
}