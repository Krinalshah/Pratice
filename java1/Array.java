import java.util.Scanner;
class min
{
	static void minimum(int a[])
	{
		int i,mini;
		mini=a[0];
		for(i=1;i<a.length;i++)
		{
         	if(a[i]<mini)
            {
              mini=a[i];
            }	
        }
		System.out.println("Minimum number is: "+mini);
	}
	static int[] arr()
	{
	 return new int[]{1,5,6,8,10};
    }	 
}	
class Array
{
	public static void main(String args[])
	{
		int a[]=new int[5],i;
		int c[]=min.arr();
		Scanner s=new Scanner(System.in);
	    for(i=0;i<a.length;i++) 
		{
           a[i]=s.nextInt();
        }
		 System.out.println("\n");
         for(i=0;i<a.length;i++)
         {
            System.out.println(a[i]);
		 }			
		 	
		for(i=0;i<c.length;i++)
         {
            System.out.println(c[i]);
		 }		
		 min.minimum(new int[]{3,4,1,2,5});
	}
}
