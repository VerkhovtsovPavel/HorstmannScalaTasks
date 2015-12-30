import scala.collection.mutable.ArrayBuffer

object Main extends App {
  val item1 = new SimpleItem(10, "Car")
  val item2 = new SimpleItem(20, "House")
  val item3 = new SimpleItem(30, "CPU")

  val bundle = new Bundle("Bundle")

  bundle.addItem(item1);
  bundle.addItem(item2);
  bundle.addItem(item3);

  println(bundle.price)

}

abstract class Item {
  def price: Double
  def description: String
}

class SimpleItem(itemPrice: Double, itemDescription: String) extends Item {
  override val price = itemPrice
  override val description = itemDescription
}

class Bundle(bundleDescription: String) extends Item {
  override val description = bundleDescription

  val items = ArrayBuffer[Item]();

  def addItem(item: Item) {
    items += item
  }

  def removeItem(item: Item) {
    items -= item
  }

  override def price = {
    var agr = 0.0;
    for (item <- items) agr += item.price
    agr;
  }
}