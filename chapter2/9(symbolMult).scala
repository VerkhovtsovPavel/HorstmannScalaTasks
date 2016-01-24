def produce(str: String) : Int = {
	if(str.length != 0)
		str.head * produce(str.tail)
	else
		1	
}