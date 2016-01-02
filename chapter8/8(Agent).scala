class Person(val name: String){
  override def toString = getClass.getName + "[name="+"]"
}

class SecretAgent(codeName : String) extends Person(codeName){
  override def toString = "secret"
  override val name = "secret"
}