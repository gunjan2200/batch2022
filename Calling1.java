class Calling1{
	 public void myMethod() 
	{
     System.out.println("this is my method ");
    }
	
	public int myMethod1( int a , int b) 
	{
		int c = a + b ;
		System.out.println("This is my method 1 addition" +c );
		
	 return c ;
    }
	
	public static void myMethod2()
	{
		System.out.println("This is my method 2 which is static method");
	}
	
	public static int myMethod3(int a , int b)  // static method cannot be override because it belongs to class 
	{
		System.out.println("This is my method 3 which is static method");
		int c = a * b ;
         System.out.println("multiplication " +c );		
		return  c; 
	
	}
	
	public double myMethod4(double a , double b)
	{
		double c = a + b ;  
		 System.out.println("This is my method 4");
         System.out.println(c); 
         return c;		 
	}
	

public static void main(String[] args)
    {
       System.out.println("this is  main method"); 
      Calling1 obj= new Calling1(); // Syntax className objectName = new ClassName();
      obj.myMethod();	
      obj.myMethod1(45,65);	  // for calling teh paramiterised method  
	  Calling1.myMethod2(); // For calling the static method   > ClassName.methodname
	  Calling1.myMethod3(15,56) ; // parameterise static method 
	 obj.myMethod4(15.26, 45.65);
	  
    }	
}