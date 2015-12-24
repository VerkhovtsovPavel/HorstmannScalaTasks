import scala.beans.BeanProperty

object Main extends App {
  val student = new Student("Pavel", 1);
  student.setId(2);
  student.id=3;
  val name = student.name
  student.getName();
}

class Student(@BeanProperty var name : String, @BeanProperty var id : Int){}