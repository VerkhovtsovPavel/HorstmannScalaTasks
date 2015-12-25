class Car(val maker: String, val model: String, val makeYear: Int, var regisataryNumber: String) {
  def this(maker: String, model: String) { this(maker, model, -1, "") }
  def this(maker: String, model: String, makeYear: Int) { this(maker, model, makeYear, "") }
  def this(maker: String, model: String, registaryNumber: String) { this(maker, model, -1, registaryNumber) }
}