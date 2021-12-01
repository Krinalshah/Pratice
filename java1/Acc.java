
	
class Acc{
	
	public static void main(String[] args)
	{
		Acc obj=new Acc();
		obj.deposite(3000);
		obj.withdral(2000);
		System.out.println("Balance is " + obj.amt);
	}
	int a_no;
	String name;
	float amt;
	
	Acc(){
		a_no=11;
		name= "ishika";
		amt=10000;
	}
	
	void deposite(float ammount)
	{
		amt=amt+ammount;
		System.out.println("Balance is "+amt);
	}
	 void withdral(float wd)
	 {
		 amt=amt-wd;
	 }
}
	
		