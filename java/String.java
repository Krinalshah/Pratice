public class String1
{
	public static String rev(String str)
	{
		 int i;
		 String rev="";
		 ch char=str.toCharArray();
		 for(i=ch.length-1;i>=0;i--)
		 {
			 rev=rev+ch[i];
		 }
		 return rev
	}
}
class Rev-String
{
	public static void main(String args[])
	{
		System.out.println(String1.rev("My name is Krinal"));
	}
}