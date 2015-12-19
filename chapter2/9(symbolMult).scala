def produce(str: String) : Int = {
	if(str.size != 0)
		str.head * produce(str.tail)
	else
		1	
}