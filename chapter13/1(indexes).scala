import scala.collection.mutable

object Main extends App {

  for (index <- indexes("qwertyuiopqqq"))
    printf("%s : {%s}\n",index._1, index._2.foldLeft("")(_ + _.toString + " ").trim)

  def indexes(str : String) : mutable.Map[Char, mutable.Set[Int]] = {
    str.zipWithIndex.foldLeft(mutable.Map[Char, mutable.Set[Int]]())(
      (map : mutable.Map[Char, mutable.Set[Int]], tuple : (Char, Int)) =>
        map + ((tuple._1, map.getOrElse(tuple._1, mutable.Set[Int]()) + tuple._2)))
  }
}
