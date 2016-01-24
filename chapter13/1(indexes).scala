import scala.collection.mutable

object Main extends App {

  for (index <- indexes("qwertyuiopqqq"))
    printf("%s : {%s}\n",index._1, index._2.mkString(", "))

  def indexes(str : String) : mutable.Map[Char, mutable.Set[Int]] = {
    str.zipWithIndex.foldLeft(mutable.Map[Char, mutable.Set[Int]]())(
      (map , tuple) => map + ((tuple._1, map.getOrElse(tuple._1, mutable.SortedSet[Int]()) + tuple._2)))
  }
}
