object Main extends App{
  val emp = new Employee()
  println(emp.getName());
  val emp2 = new Employee("12", 23.7);
  println(emp2.getName())
}

class Employee {
  
  private var name = "Jonh Q. Public"
  var salary = 0.0


  def this(empName: String , salary: Double )
  {
    this()
    this.name = empName;
    this.salary = salary;
  }

  def getName() : String = name
}