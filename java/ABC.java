class D
{
 D A()
 {
	 return this;
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
class ABC
{
	public static void main(String args[])
	{
		
	
		new B().A().msg1();
		new C().A().msg(); 
	}
}