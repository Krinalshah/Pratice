import java.util.Scanner;
class Mutliply1
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
	int i,ans;
	for (i=1;i<=10;i++)
	{
		ans=a*i;
		System.out.println(a+"*"+i+"="+ans);
	}
		
}
}
