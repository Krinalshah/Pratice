import java.util.Scanner;
class Leap
{
	public static void main(String args[])
	{
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter the year");
		int a=s.nextInt();
		
		
		leap(a);
		
	}
	public static void leap(int a)
{
	if(a%4==0)
	 System.out.println("Year is leap year");	
    else
		System.out.println("Year is not a leap year");	
}
}