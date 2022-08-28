class Demo{
	public static void add (){
		System.out.println("This is non parameterised static method"); 
	}
	
	public static int add1( int a ,  int b)
	{
		System.out.println("");
        int c = a + b ;
        return c ; 		
		
	}
	
	public static void main(String[] args){
		
		System.out.println("This is main method"); 
		Demo.add(); 
		
		int v = Demo.add1(15 , 25);    // we can call static method without using class name in the same class 
		System.out.println("addition is" +v);
		
	}
}	