package pack;
class A
{
int a;
String name;
	void details()
	{
		System.out.println("rollno"+a);
		System.out.println("name"+name);
	}
}
class exe
{
	public static void main(String args[])
	{
		A obj=new A();
		obj.details();
	}
}