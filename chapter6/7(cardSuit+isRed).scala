object Main extends App {
  println(CardSuit.Clubs.toString)
  
  println(CardSuit.isRed(CardSuit.Hearts));
  println(CardSuit.isRed(CardSuit.Spades));
}

object CardSuit extends Enumeration {
  val Spades = Value("♠")
  val Hearts = Value("♥")
  val Diamonds = Value("♦")
  val Clubs = Value("♣")
  
  def isRed(cardSuit : CardSuit.Value) = {
    if (cardSuit.equals(CardSuit.Hearts) || cardSuit.equals(CardSuit.Diamonds))
      true
    else
      false
  }
}