import java.util.Scanner;
class Reverse
{
	public static void main(String args[])
	{
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter the number");
		int a=s.nextInt();
		
		
		rev(a);
		
	}
	public static void rev(int a)
{
	int no,r=0,ans;
	no=a;
	while(no>0)
	{
		ans=no%10;
		r=r*10+ans;
		no=no/10;
	}
	System.out.println("reverse number is "+r);	
}
}