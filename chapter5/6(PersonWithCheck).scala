object Main extends App{
	val person = new Person(22, "Pavel Verkhovtsov")

	println(person.firstName);
	println(person.lastName);

}

class Person(var age : Int, val fullName : String)
{
	if (age < 0) age = 0
	val firstName = fullName.split(" ")(0);
	val lastName = fullName.split(" ")(1);
}