class pratice
{
  private String name;
  public int rollno,age;
  pratice(){}
  pratice(int r,int a)
  {
	  rollno=r;
	  age=a;
  }
  pratice(pratice s)
  {
	  rollno=s.rollno;
	  age=s.age;
  }
  public String getName()
  {
	  return name;
  }
  public void setName(String name)
  {
	  this.name=name;
  }
  public void display()
  {
	  System.out.println("your name is "+name);
	  System.out.println("your rollno is "+rollno);
	  System.out.println("your age is "+age);
  }
}
class Testing
{
	public static void main(String args[])
	{
		pratice p=new pratice(1,20);
		pratice p1=new pratice(p);
		pratice p2=new pratice();
		p.setName("Krinal");
		p.display();
		p1.display();
		p2.rollno=p.rollno;
		p2.age=p.age;
		p2.display();
		
	}
}