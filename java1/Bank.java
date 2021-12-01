
 class Account
{
	int acc_no,amt;
	String name;
	Account(int acc_no,String name,int amt)
	{
		this.acc_no=acc_no;
		this.name=name;
		this.amt=amt;
	}
	void deposit(int amt)
	{
		this.amt+=amt;
		System.out.println("You deposited amount is "+amt+"Rs");
		System.out.println("You total balance is "+this.amt+"Rs");
	}
	void withdraw(int amt)
	{
		this.amt-=amt;
		System.out.println("You withdrawl amount is "+amt+"Rs");
		System.out.println("You total balance is "+this.amt+"Rs");
	}
	public int inte()
	{
		return 7;
	}
	void display()
	
    {
	  System.out.println("You acc_no is "+this.acc_no);	
      System.out.println("You name is "+name);
	  System.out.println("You total balance is "+amt+"Rs");
    }
}	
class SBI  extends Account
{
	SBI(int acc_no,String name,int amt)
	{
		super(acc_no,name,amt);
	}
	public int inte()
	{
		int c=super.inte(),amt1;
		amt=super.amt;
		amt1=(amt*c/100);
		return amt1;
	}
}
class Bank
{
	public static void main(String args[])
	{
		int c;
		SBI obj1=new SBI(1,"krinal",10000);
		c=obj1.inte();
		System.out.println("You amount of interest is "+c+"Rs");
		obj1.deposit(3000);
		obj1.withdraw(1000);
		obj1.display();
	}
}