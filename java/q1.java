class A
{
	
  String color="RED",name;
  int id;
  A(int id, String name)
  {
	  this.id=id;
	  this.name=name;
  }
  void food()
  {
    System.out.println("I love pizza");
  }
}

 class B extends A
 {
	 int salary;
	 B(int id,String name,int salary)
	 {
		 super(id,name);
		 this.salary=salary;
	 }
	 void food()
	 {
		 super.food();
		 System.out.println("I love mango");
		 System.out.println(super.color);
		 System.out.println("id"+id);
		 System.out.println("name="+name);
		 System.out.println("salary="+salary);
	 }
 }
 class q1
 {
	 public static void main(String args[])
	 {
		 B obj= new B(1,"krinal",40000);
		 obj.food();
	 }
 }