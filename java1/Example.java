class Animal
{
	void eat()
	{
		  System.out.println("Eating");
	}
}
class Cat 
{
	 void meow()
	 {
		 System.out.println("Meowing");
	 }
}
class Dog extends Animal,Cat
{
	
	void bark()
	{
		System.out.println("barking");
	}
}
class Example
{
	public static void main(String args[])
	{
		Dog d =new Dog();
		d.bark();
		d.meow();
		d.eat();
	}
}
	