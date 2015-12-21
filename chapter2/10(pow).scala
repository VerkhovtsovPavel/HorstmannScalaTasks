object Main extends App{

  print(pow(2, 8));

  def pow(x: Double, n: Int): Double = {
    if (n == 0)
      1
    else if (n < 0)
      1 / pow(x, -n)
    else if (n % 2 == 0) {
      val y = pow(x, n / 2)
      y * y
    } else
      x * pow(x, n - 1)
  }
}