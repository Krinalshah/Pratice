import java.util.*;
 class details
{
	static int a=5 ;
	int b=5;
	details()
	{
		this(10);
		System.out.println("hello world");
	}
	details(int b)
    {
	 
	  this.b=b;
	  System.out.println(b);
	}
	 void display()
	{

	  System.out.println("a=" +a*a*a);
	  
	}
	void exe()
	{
		this.display();
    }	
}

class main
{   
static{
	int a=4;
	System.out.println(a+a);
}
  public static void main(String args[])
  {
	  details o=new details();
	  details obj=new details(8);
	  obj.exe();
	  
	  
	 
	  
	  
}
}