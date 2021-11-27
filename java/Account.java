import java.util.*;
class Account
{
	int amt,acc_no;
	string name;
	 void insert(int name1,int a,int amt1)
	 {
		 name=name1;
		 acc_no=a;
		 amt=amt1;
	 } 
	 void deposit(int amount)
	 {
		 amt=amt+amount;
		 System.out.println("Your deposited amount is",amount);
		 System.out.println("Your total amount is",amt);
	 }
	 void withdraw(int amount,l_b)
	 {
		 if (amt>l_b)
		 {
			 amt=amt-amount;
			 System.out.println("Your withdraw amount is",amount);
			 System.out.println("Your balance is after withdrawl",amt);
		 }
		 else
		 {
			 System.out.println("Amount is insufficient");
		 }
	 }
   class main()
   {   
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the amount");
	  int a=sc.nextInt();
	  Account obj=new Account();
	  obj.insert("Krinal",123,a);
	  obj.deposit(2000);
	  obj.withdraw(3000,1000)
  }
}
