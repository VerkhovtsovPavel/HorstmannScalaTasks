object Main extends App{
    val arr = Array[Int](-1,2,3,0,5,-6,7);

    val newArr = arr.filter(_ > 0) ++ arr.filter(_ <= 0)
    
    for(item <- newArr)
      print(item+" ");
}