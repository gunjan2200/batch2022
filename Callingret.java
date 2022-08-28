class Callingret{
	
public int method1( int a  , int b)
{
	System.out.println("This is method1");
	int c = a + b ;  
	return c;
}
	
	public static void main (String[] args)
	{
		System.out.println("this is  main method");
		Callingret c = new Callingret();
		int v = c.method1(25 , 56);
		System.out.println("addition of number is" +v);
	}
	
}