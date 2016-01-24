object Main extends App {

  for (index <- indexes("qwertyuiopqqq"))
    printf("%s : %s\n",index._1, index._2.mkString("{",", ", "}"))

  def indexes(str : String) : Map[Char, List[Int]] = {
    str.zipWithIndex.foldLeft(Map[Char, List[Int]]())(
      (map, tuple) => map + ((tuple._1, map.getOrElse(tuple._1, List[Int]()) :+ tuple._2)))
  }
}
