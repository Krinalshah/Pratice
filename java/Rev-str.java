public class Rev_Str
{
	public static void main(String args[])
	
	{
		 String str="My name is Krinal";
		char ch[]=str.toCharArray();
		 int i;
		 String rev="";
		 
		 for(i=ch.length-1;i>=0;i--)
		 {
			 rev=rev+ch[i];
		 }
		 System.out.println(rev);
	}
}

