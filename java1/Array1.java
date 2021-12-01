class Array1
{
	public static void main(String args[])
	{
		int a[][]=new int[3][];
		int b[]={1,2,3};
		int d[]=b.clone();
		int count=0;
		Class c=b.getClass();
		String name=c.getName();
		a[0]=new int[2];
		a[1]=new int[1];
		a[2]=new int[3];
		int i,j;
		for(i=0;i<3;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
			  a[i][j]=count++;
		       System.out.print(a[i][j]+" ");
			}
			  System.out.println();
		}
		System.out.println(name);
		for(int k:d)
		{
			System.out.println(k);
		}
	}
}