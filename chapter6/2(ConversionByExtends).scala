object Main extends App{

  val converters = Array(InchesToCentimeters, GallonsToLiters, MilesToKilometers)

  for(converter <- converters)
    println(converter.convert(30))
}

abstract class UnitConversions {
  def convert(param : Double) : Double
}

object InchesToCentimeters extends UnitConversions{
  private val incheToCentimeter = 2.54

  override def convert(param: Double): Double = param * incheToCentimeter
}

object GallonsToLiters extends  UnitConversions{
  private val gallonToLiter = 3.78541

  override def convert(param: Double): Double = param * gallonToLiter
}

object MilesToKilometers extends UnitConversions {
  private val mileToKilometer = 1.60934

  override def convert(param: Double): Double = param * mileToKilometer
}
