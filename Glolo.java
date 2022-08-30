import java.util.*; 
class Glolo{
	
String m = "Welcome to Super  Cinema" ;        // global variable

    public void ticketCounter ( int a , String b)
    {
	   System.out.println(m);
	 if( b == "u"){  
        System.out.println("your oder for  " +a + " tickets upper seat");  
    }  
    else if( b == "m"){  
        System.out.println("your oder for  " +a + " tickets middle seat");  
    }  
    else {  
        System.out.println("your oder for  " +a + " tickets lower seat");  
    }  
	
	
    }	

  public static void main (String[] args)
    { 
          Glolo g = new  Glolo();
 
          Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
          System.out.print("Enter the number ticket you want");  
          int a= sc.nextInt();  
		  
		  System.out.print(" enter the category of ticket" + "\n Upper = u" + "\n middle = m " + "\n lower = l " );  
		  Scanner sc1= new Scanner(System.in); 
          String str = sc1.nextLine();  
		   
		  
		  g.ticketCounter(a , str);
    }
	
}