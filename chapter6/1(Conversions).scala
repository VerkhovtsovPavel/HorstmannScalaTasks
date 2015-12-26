object Main extends App{
  println(Conversions.gallonsToLiters(20))
  println(Conversions.inchesToCentimeters(20))
  println(Conversions.milesToKilometers(20))

}

object Conversions {
  private val incheToCentimeter = 2.54
  private val gallonToLiter = 3.78541
  private val mileToKilometer = 1.60934

  def inchesToCentimeters(inche : Int) = {
    inche * incheToCentimeter
  }

  def gallonsToLiters(gallons : Int) = {
    gallons * gallonToLiter
  }

  def milesToKilometers(miles : Int) = {
    miles * mileToKilometer
  }
}