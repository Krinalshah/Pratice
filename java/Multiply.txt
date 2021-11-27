import java.util.Scanner;
class largest1
{
	public static void main(String args[])
	{
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter value of 1st number");
		int a=s.nextInt();
		System.out.println("Enter value of 2nd number");
		int b=s.nextInt();
		
		large(a,b);
		
	}
	public static void large(int a,int b)
{
	if (a>b)
			System.out.println("a is largest number");
		
		else
		
			System.out.println("b is largest");
		
}
}
