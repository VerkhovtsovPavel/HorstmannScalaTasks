object Main extends App{

    val chain = new Stub with PlusOperation with MultOperation
    println(chain.process("1+3"))
    println(chain.process("1*3"))

}

class Stub

trait ChainElement {
  def process(msg : String) : Option[Int] = None
}

trait PlusOperation extends ChainElement{
  val sumOper = """(\d+)\+(\d+)""".r

  override def process(msg: String): Option[Int] = {
    if(msg.contains('+')){
      val sumOper(first , second) = msg
      val result = first.toInt + second.toInt
      Option[Int](result)
    }else
      super.process(msg)

  }
}

trait MultOperation extends ChainElement{
  val multOper = """(\d+)\*(\d+)""".r

  override def process(msg: String): Option[Int] = {
    if(msg.contains('*')){
      val multOper(first , second) = msg
      val result = first.toInt * second.toInt
      Option[Int](result)
    }else
      super.process(msg)

  }
}



