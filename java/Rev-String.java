public class String1
{
	public static String rev(String str)
	{
		char ch[]=str.toCharArray();
		 int i;
		 String rev="";
		 
		 for(i=ch.length-1;i>=0;i--)
		 {
			 rev=rev+ch[i];
		 }
		 return rev;
	}
}

public class Rev-String
{
	public static void main(String args[])
	{
		System.out.println(String1.rev("My name is Krinal"));
	}
}