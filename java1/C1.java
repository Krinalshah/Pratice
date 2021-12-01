class s1
{
	int rollno,age,fees;
	s1(int rollno,int age)
	{
		this.rollno=rollno;
		this.age=age;
	}
	s1(int rollno,int age,int fees)
	{
		this(rollno,age);
		this.fees=fees;
	}
	void display()
	{
		System.out.println(rollno+" "+age+" "+fees);
	}
}
class C1
{
	public static void main(String args[])
	{
		s1 obj=new s1(1,20);
		s1 obj1=new s1(2,30,20000);
		obj.display();
		obj1.display();
	}
}