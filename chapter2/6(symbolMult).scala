def symbolMult(str: String) : Int = {
	str.reduceLeft((agr, ch) : Int ={
		agr*=ch;
		})
}
