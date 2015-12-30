import scala.beans.BeanProperty

abstract class Person(@BeanProperty var name: String, @BeanProperty var age: Int, @BeanProperty var isMale: Boolean) {}

class Student(@BeanProperty var group: String, @BeanProperty var rating: Double, name: String, age: Int, isMale: Boolean) extends Person(name, age, isMale) {

  override def toString() = { "Student " + getName() + " group " + getGroup() + " rating " + getRating(); }
}

class Teacher(@BeanProperty var title: String, @BeanProperty var subject: String, name: String, age: Int, isMale: Boolean) extends Person(name, age, isMale) {

  override def toString() = { "Teacher " + getName() + " title " + getTitle() + " subject " + getSubject(); }
}

class Dean(@BeanProperty var faculty: String, name: String, age: Int, isMale: Boolean) extends Person(name, age, isMale) {

  override def toString() = { "Dean " + getName() + " faculty " + getFaculty(); }
}