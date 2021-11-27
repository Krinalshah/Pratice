class D
{
 D A()
 {
	 return this;
 }
 void print()
 {
	  System.out.println("HII");
 }
}
class B extends D
{
	@Override
	B A()
	 {
		 return this;
	 }
	 void msg1()
	 {
		 System.out.println("how are you");
	 }
}
class C extends B
{
	@Override
	C A()
	{
		return this;
	}
	 void msg()
	 {
		 System.out.println("hello world");
	 }
}
class Main
{
	public static void main(String args[])
	{
		D ob=new D();
		ob.A().print();
		B obj =new B();
		obj.A().msg1();
		C obj1=new C();
		obj1.A().msg(); 
	}
}