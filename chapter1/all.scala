import scala.math._;
import scala.BigInt.probablePrime;
import scala.util.Random;
object Main extends App{
  val ex2 = pow(sqrt(3), 2);
  println(ex2);

  println("crazy" * 3);
  
  val ex6 = BigInt(2).pow(1024);
  println(ex6);
  
  val ex8 = ex6.toString(36);
  println(ex8);
  
  probablePrime(100, Random);
  
  val ex9 = ex8(0);
  println(ex9)

}