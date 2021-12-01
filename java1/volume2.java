class volume2
{
	int w,h,d;
	volume2()
	{
		w=15;
		h=16;
		d=17;
	    System.out.println("volume of box in default constructor is "+w*h*d);
	}
    volume2(int w,int h,int d)
	{
		this.w=w;
		this.h=h;
		this.d=d;
		System.out.println("volume of box in parameterized constructor is "+w*h*d);
	}
	volume2(volume2 a)
	{
		w=a.w;
		h=a.h;
		d=a.d;
		System.out.println("volume of box in copy constructor is "+w*h*d);
	}
	public static void main(String args[])
	{
		volume2 obj=new volume2();
		volume2 obj1=new volume2(11,12,13);
		volume2 obj2=new volume2(obj1);
	}
}