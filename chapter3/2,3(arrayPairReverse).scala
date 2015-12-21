object Main extends App{
    val arr = Array[Int](1,2,3,4,5,6,7);
    
    
    val newArr = for( i <- 0 until arr.length) yield {
      if(i==arr.length-1)
        arr(i)
     else if(i%2==0)
          arr(i+1)
        else
          arr(i-1)
    }
    
    print(newArr);
}