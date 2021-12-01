class add
{
  add get()
  {
	  return this;
  }
  void add1(int a,int b)
  {
    System.out.println(a+b);
  }
}
class abc extends add
{
	 @Override
	abc get()
	{
		return this;
	}
	void add1(int a,int b)
	{
		System.out.println(a*b);
	}
}
class Addition
{
	public static void main(String args[])
	{
	
		add obj=new add();
		obj.get().add1(20,20);
		abc obj1=new abc();
		((abc)obj1.get()).add1(30,30);
	}
}