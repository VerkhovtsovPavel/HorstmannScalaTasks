object Main extends App {
  val time = new Time(12, 30);
  val time2 = new Time(14, 30);
  
  println(time.isBefore(time2));
  println(time2.isBefore(time));
}

class Time(hour : Int, minute : Int){
  private val time : Int = hour*60 + minute
  def isBefore(other : Time) : Boolean = {
    time < other.time
  }
}

