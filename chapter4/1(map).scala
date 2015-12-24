object Main extends App{
    val map = Map("CPU"->100, "LCD" -> 30, "Keyboard" ->10)
    
    val discontMap = for ((k ,v) <- map) yield (k, v*0.9)
    
    println(discontMap)

}