import java.lang.System
object Main extends App {
  val userName = System.getProperty("user.name")
  
  Console.out.print("Enter password> ")
  val password = Console.readLine()
  if(password.length()<8)
    Console.err.println("Password insufficient secret")
  else
    Console.out.println(s"Hello $userName")
}