class arrays
{
	public static void main(String args[])
	{
	int a[]={2,5,4,3,9,8,1,7},temp;
	System.out.println("Array before sorting");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	System.out.println("\n");
	for(int i=0;i<a.length-1;i++)
	{
		for(int j=0;j<a.length-1;j++)
		{
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	 System.out.println("Array after sorting");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	}
}	
 