import java.util.Scanner;
class Instance
{
	static int m=100;
  public static void main(String args[])
  {
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the value");
	  int a=s.nextInt();
	  print(a,m);
	  print(a,m);
	 
  }
	static void print(int a,int m)
	{
		m++;
		System.out.println(a);
		 System.out.println(m);
		 
		
	}
  }
