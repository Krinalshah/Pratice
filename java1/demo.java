package mypack;
import pratice.*;
public class demo
{
	public static void main(String args[])
	{
		pra obj1=new pra();
		obj1.show();
		demo obj=new demo();
		obj.event();
		
	}
	public void event()
   {
        System.out.println("public class inside same package");
   }
}