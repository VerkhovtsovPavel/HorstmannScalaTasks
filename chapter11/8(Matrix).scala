object Main extends App {
  val intArr = Array.ofDim[Int](2, 2)

  intArr(0)(0) = 1
  intArr(0)(1) = 2
  intArr(1)(0) = 3
  intArr(1)(1) = 4

  val matrix = new Matrix(intArr)

  println(matrix)

  println(matrix + matrix)

  println(matrix * 3)

  println(matrix * matrix)

  val errArr = Array.ofDim[Int](1, 1)

  errArr(0)(0) = 1

  val errMatrix = new Matrix(errArr)
  try {
    println(matrix + errMatrix)
  } catch {
    case ex: InvalidMatrixException => println(ex.getMessage)
  }

  try {
    println(matrix * errMatrix)
  } catch {
    case ex: InvalidMatrixException => println(ex.getMessage)
  }
}

class Matrix(private val matrix: Array[Array[Int]]) {

  def +(other: Matrix) = {
    if (matrix.length != other.matrix.length || matrix(0).length != other.matrix(0).length)
      throw new InvalidMatrixException("Martix must be equals order")

    val result = Array.ofDim[Int](matrix.length, matrix(0).length)

    for (line <- matrix.indices)
      for (element <- matrix(0).indices)
        result(line)(element) = matrix(line)(element) + other.matrix(line)(element)

    new Matrix(result)
  }

  def *(const: Int) = {
    new Matrix(matrix.map(_.map(_ * const)))
  }

  def *(other: Matrix) = {
    if (matrix(0).length != other.matrix.length)
      throw new InvalidMatrixException("Count of columns first matrix must be equals count of rows second")

    val result = Array.ofDim[Int](matrix.length, matrix(0).length)

    for (row <- matrix.indices)
      for (column <- other.matrix(0).indices)
        for (element <- matrix(0).indices)
          result(row)(column) += matrix(row)(element) * other.matrix(element)(column)

    new Matrix(result)
  }

  override def toString = {
    matrix.foldLeft("")(_ + _.foldLeft("")(_ + " " + _) + "\n")
  }

}

class InvalidMatrixException(message: String) extends Exception(message)