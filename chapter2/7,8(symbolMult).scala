def produce(str: String) : Int = {
	str.map(_.toInt) reduceLeft(_*_)
}
