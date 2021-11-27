class Animal
{
	void eat()
	{
		  System.out.println("Eating");
	}
}
class Cat extends Animal
{
	 void meow()
	 {
		 System.out.println("Meowing");
	 }
}
class Dog extends Animal{
	void bark()
	{
		System.out.println("barking");
	}
}
class Example
{
	public static void main(String args[])
	{
		Cat c=new Cat();
		Dog d =new Dog();
		c.meow();
		d.bark();
	}
}
	