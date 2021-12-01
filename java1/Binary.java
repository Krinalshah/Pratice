import java.util.Scanner;
class Binary
{
	
        public void bin()
		{
		int a[]={1,2,3,4,5,6,7};
		int mid,low,high;
		System.out.println("enter the key");
		Scanner s=new Scanner(System.in);
		int key=s.nextInt();
		low=0;
		high=6;
		mid=(low+high)/2;
		while(low<=high)
		{
		   mid=(low+high)/2;	
		    if(a[mid]==key)
			{
				System.out.println("key is found"+a[mid]);
				break;
			}
		
			else if(key<a[mid])
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
				
			}
		}
	    }
		public static void main(String args[])
		{
			new Binary().bin();
		}
}