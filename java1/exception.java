class exception
{
	public static void main(String args[])
	{
		 try
		 {
			 int a[]=new int[5];
             a[0]=2;
             a[1]=0;
             a[2]=4;
             a[3]=5;
             a[4]=6;
             int b=a[10]/a[3];
			 System.out.println(b);
		 try
        {
           int c=a[0]/a[1];
        }
        
		 catch(ArithmeticException e)
		 {
			 System.out.println(e);
		 }
         }
         catch(NullPointerException e)
         {
           System.out.println(e);
         }
         finally{
          System.out.println("Code is excuted without any error");
        }
	}
}