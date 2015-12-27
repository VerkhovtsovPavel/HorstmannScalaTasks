object Main extends App {
  println(CardSuit.Clubs.toString)
}

object CardSuit extends Enumeration{
  val Spades = Value("♠")
  val  Hearts = Value("♥")
  val  Diamonds = Value("♦")
  val  Clubs = Value("♣")
}