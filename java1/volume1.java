class volume1
{
	int w=12,d=13,h=14;
	void vol()
	{
	   System.out.println("volume is "+w*h*d);
	}
	int vol1()
	{
		return w*h*d;
	}
	static void vole(int w,int d,int h)
	{
		System.out.println("volume of static class is "+w*h*d);
	}
	public static void main(String args[])
	{
		volume1 obj=new volume1();
		obj.vol();
		System.out.println("volume of int method is "+obj.vol1());
		vole(15,16,17);
	}
}