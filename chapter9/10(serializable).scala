import scala.collection.mutable.ArrayBuffer
import java.io._

object Main extends App { 
  val pavel = new Person("Pavel")
  val jack = new Person("Jack")
  val helen = new Person("Helen")
  
  pavel.addFriend(jack)
  pavel.addFriend(helen);
  
  pavel.saveFrients("friends");
  pavel.loadFrients("friends");
  
  println(pavel)

}

class Person(val name : String) extends Serializable{
  private val friends = new ArrayBuffer[Person]
  
  def addFriend(person : Person) { friends+= person}
  def removeFriend(person : Person) { friends-= person}
  
  def saveFrients(filePath : String){
    val out = new ObjectOutputStream(new FileOutputStream(filePath))
    out.writeObject(friends)
    out.close()
  }
  
  def loadFrients(filePath : String){
    val in = new ObjectInputStream(new FileInputStream(filePath))
    friends.clear()
    friends++=in.readObject().asInstanceOf[ArrayBuffer[Person]]
    in.close()
  }
  
  override def toString() = {
    var result = "Person "+name+"\nFriends:\n"
    for(friend <- friends)
      result+=friend.name+"\n"
      
    result  
  }
}