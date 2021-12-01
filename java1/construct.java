class abc
{
	int id;
	String name;
	abc(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}
class xyz extends abc
{
	int salary;
	xyz(int id,String name,int salary)
	{
		super(id,name);
		this.salary=salary;
	}
	
void display()
{
	System.out.println("id is ="+id );
	System.out.println("name is ="+name );
	System.out.println("salary is ="+salary );
}
}

class construct
{
	public static void main(String args[])
	{
		xyz obj=new xyz(1,"abc",10000);
		obj.display();
	}
}