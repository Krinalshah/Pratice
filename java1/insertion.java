class insertion
{
	public static void main(String args[])
	{
	int a[]={2,5,4,3,9,8,1,7},temp,i,j;
	System.out.println("Array before sorting");
	for( i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	System.out.println("\n");
	for( i=1;i<a.length;i++)
	{
		temp=a[i];
		for( j=i-1;j>=0&&temp<=a[j];j--)
		{
			a[j+1]=a[j];
		}
		 a[j+1]=temp;
	}
	 System.out.println("Array after sorting");
	for(i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	}
}	