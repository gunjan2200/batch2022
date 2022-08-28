class Arithmatic {
	
	public static int addition(float a , double b) 
	{
		int c = (int)(a + b); 
        return c; 
		}
	public long multiplication(int a , int b)
 	{
		int c= a*b ; 
		return c ; 
	}	
	public float substraction (float a ,  float b)
	{
	 float c = a - b ;
     return c ; 	 
	}	
	
	public  double division(int a ,  long b )
	{
	 double c= a / b ; 
     return c ; 	 
	}	
	
	public static void main(String[] args)
	{
		System.out.println("This is main method");
		
		Arithmatic a = new Arithmatic();
		int v = addition(25.23f,56.58d);
		System.out.println("Addition is " +v);
		
		long v1 = a.multiplication(5,6);
		System.out.println("multiplication is " +v1);
		
		float v2 = a.substraction(56.25f,48.235f);
		System.out.println("substraction is " +v2);
		
		double v3= a.division(25,5); 
		System.out.println("division is " +v3 );
		
	}
}