import java.util.Scanner;
class abc
{
	static int c=1;
	int a=12;
	static void display()
	{
		c++;
		System.out.println("value of c is "+c);
	}
}
class Instance1
{
	static int m=100;
  public static void main(String args[])
  {
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the value");
	  int a=s.nextInt();
	  print(a,m);
	  print(a,m);
	  abc.display();
	  abc.display();
	 
  }
	static void print(int a,int m)
	{
		m++;
		System.out.println(a);
		 System.out.println(m);
		 
		
	}
  }
