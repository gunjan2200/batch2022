class Demo2{
	public int addchar(char a , char b)
	{
	int c = a + b ; 
	return c ; 
	}
	
	public static void main (String[] args){
		Demo2 b= new Demo2();
        int d = b.addchar('a','d');		
		System.out.println("adding character " +d);
	}
}