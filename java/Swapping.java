import java.util.Scanner;
class Swapping
{
	public static void main(String args[])
	{
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter value of 1st number");
		 int a=s.nextInt();
		 System.out.println("Enter value of 2nd number");
		 int b=s.nextInt();
		 swap(a,b);
		
	}
	public static void swap(int a,int b)
{
	int c;
	c=a;
	a=b;
    b=c;
    System.out.println("value of a after swapping is "+a);
	System.out.println("value of b after swapping is "+b);
	
}
}