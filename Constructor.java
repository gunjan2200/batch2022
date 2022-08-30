class  Constructor {
	
	public Constructor(){
		System.out.println("This is constructor without parameter");
	}
	
	public Constructor( int a , int b){
		System.out.println("This is constructor with parameter");
		
		int d = a + b  ;            //   Sample task 
        System.out.println("addition is " +d );		
	}
	
	public static void main(String[] args){
		System.out.println("This is main method");
		Constructor c = new Constructor(); 
		Constructor c1 = new Constructor(12 , 35); 
	}
	
	
	
}



/**A constructor in Java is a special method that is used to initialize objects. 
The constructor is called when an object of a class is created. 
It can be used to set initial values for object attributes.
Every time an object is created using the new() keyword, at least one constructor is called
n Java, a constructor is a block of codes similar to the method. 
It is called when an instance of the class is created.
 At the time of calling the constructor, memory for the object is allocated in the memory.
**/