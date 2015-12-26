object Main extends App {
  val reverseArgs = args.reverse

  for(arg <- reverseArgs){
    print(arg+" ")
  }
}