import java.util.Scanner;
class Mutliply
{
	public static void main(String args[])
	{
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter value of 1st number");
		int a=s.nextInt();
		
		
		multi(a);
		
	}
	public static void multi(int a)
{
	int i;
	for (i=1;i<=10;i++)
	{
		ans=a*i;
		System.out.println(a+"*"+i+"="+ans);
	}
		
}
}
