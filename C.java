public class C
{


public void simpleMethod()
{
System.out.println("method m1");

}

public static void staticMethod()
{
System.out.println("static method");

}
public static void main(String[] args)
{
System.out.println("in main method");
//objectCreation
C d = new C();
		d.simpleMethod(); 
//static method
		C.staticMethod();
		

}



}