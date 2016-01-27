import org.junit.Test

@deprecated
class Deprecated(@deprecated y : Int) {

  @deprecated val x = 5

  @deprecated
  def plus(@deprecated a : Int, b: Int) = (a : @deprecated) + b
}