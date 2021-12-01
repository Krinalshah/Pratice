import java.util.Arrays;
class Copying
{
	public static void main(String args[])
	{
		int a[]={5,3,8,1,2,9,4};
		
		int b[]=Arrays.copyOf(a,6);
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		System.out.print("\n");
		Arrays.sort(a,2,5);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.print("\n");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}
}