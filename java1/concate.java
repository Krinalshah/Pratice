class concate
{
	public static void main(String args[])
	{
		StringBuffer str=new StringBuffer();
		str.append("hello world");
		String s="chocalate";
		String t="i love".concat(" ").concat(s);
		String c=t.replace("love","like");
	    System.out.println(c.toLowerCase());
		
	    System.out.println(str.capacity());
	    
		System.out.println(str.replace(6,10,"java"));
		System.out.println(str.delete(5,6));
	}
}