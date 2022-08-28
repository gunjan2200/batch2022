class Demo3{
	int a ; 
	int b ; 
	int c ; 
	
	public void add()
	{   a = 20;
	    b = 15 ; 
		c = a + b ; 
        System.out.println("addition  is "   +c);
	}
	
	public  void mul()
	{   a = 20;
	    b = 15 ; 
		c = a * b ; 
        System.out.println("multiplication  is "   +c);
	}
	
	public   void sub()
	{   a = 20;
	    b = 15 ; 
		c = a - b ; 
        System.out.println("substraction  is "   +c);
	}
	
	public   void div()
	{   a = 20;
	    b = 15 ; 
		c = a / b ; 
        System.out.println("division  is "  +c);
	}
	
	
	
	public static void main (String[] args)
	{
		Demo3 d = new Demo3(); 
		d.add();  
		d.mul(); 
		d.sub(); 
		d.div(); 
		
	}
	
	
}