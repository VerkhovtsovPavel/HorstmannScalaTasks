object Main extends App {
  val time = new Time(12, 30);
  val time2 = new Time(14, 30);
  
  println(time.isBefore(time2));
  println(time2.isBefore(time));
}

class Time(val hour : Int, val minute : Int){
  def isBefore(other : Time) : Boolean = {
    hour*60 + minute < other.hour*60 + minute
  }
}

