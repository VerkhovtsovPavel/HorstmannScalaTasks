//Don't work
def pow(x : Double, n : Int) : Double = {
	if(n==0)
		1
	else if (n<0)
		1/pow(x, -n)
	else if (n % 2==0)
		pow(pow(x, n/2), 2)
	else
		x * pow(x, n-1)
}