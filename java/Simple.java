 public class Simple{
	int a;
	String b;
    Simple()
	{
		a=9;
		b="Krinal";
	}
	Simple(Simple obj)
	{
		a=obj.a;
		b=obj.b;
	}
	private void add()
	{
		
		System.out.println(a+b);
	}

	

 public static void main(String args[]){
 Simple obj=new Simple();
 Simple obj1=new Simple(obj);
 obj.add();
 obj1.add();
}
 }
