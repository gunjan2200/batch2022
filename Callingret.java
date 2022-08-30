class Callingret{
	
public int method1( int a  , int b)
{
	System.out.println("This is method1");
	int c = a + b ;  
	return c;                              // Return type method 
}
	
	public static void main (String[] args)
	{
		System.out.println("this is  main method");
		Callingret d = new Callingret();
		int v = d.method1(25 , 56);                       //Storing the value of c  into  v by declaring it as integer 
		System.out.println("addition of number is" +v);
	}
	
}

/** Calling return type method  