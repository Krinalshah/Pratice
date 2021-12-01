class Dog
{
	void eat()
	{
		System.out.println("Eating");
	}
}
class Cat extends Dog
{
	void eat(){
		System.out.println("cat eating");
	}
}
class Animal extends Cat
{
	void eat(){
			System.out.println("dog eating");
	}
	public static void main(String[] args)
	{
		Dog a1,a2,a3;
		a1=new Animal();
		a2=new Dog();
		a3=new Cat();
		a1.eat();
		a2.eat();
		a3.eat();
	}	
}
