object Main extends App {
  val zipper = "Hello".zip("World");
  println(zipper);
  
  val owner = Array("Mark", "Pavel", "Jack");
  val order = Array("Soup", "Carrot", "Bacon")
  
  for(item <- owner.zip(order))
    println(item)
}