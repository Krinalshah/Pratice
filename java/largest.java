import java.util.Scanner;
class largest
{
	public static void main(String args[])
	{
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter value of 1st number");
		int a=s.nextInt();
		System.out.println("Enter value of 2nd number");
		int b=s.nextInt();
		System.out.println("Enter value of 3rd number");
		int c=s.nextInt();
		large(a,b,c);
		
	}
	public static void large(int a,int b,int c)
{
	if (a>b&&a>c)
			System.out.println("a is largest number");
		
		else if(b>c)
		
			System.out.println("b is largest");
		
		else
		
			System.out.println("c is largest");
		
}
}