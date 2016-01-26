abstract class Item{
  def price(it: Item = this) : Double = it match {
    case Product(_, p) => p
    case Bundle(_, disc, its @ _*) => its.map(price).sum - disc
    case Multiple(count, item) => price(item) * count

  }
}
case class Product(description : String, price : Double) extends Item
case class Bundle(description : String, discount : Double, items: Item*) extends Item
case class Multiple(count : Int, item : Item) extends Item

object Main extends App {
  val order = Multiple(2,Bundle("qw", 20,
    Product("e", 34.0), Multiple(3,Product("r", 50))))

  print(order.price())
}