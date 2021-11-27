import java.util.Scanner;
class factorial
{
	public static void main(String args[])
	{
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter value of 1st number");
		 int a=s.nextInt();
		 fact(a);
		
	}
	public static void fact(int a)
{
   int i,f=1;
   for(i=a;i>0;i--)
   {
     f=f*i;
   }
     System.out.println("The value of factorial is"+f);   
}
}