
 public class Inheritance 
{
	 public static void main(String args[])
		{
			Dog d = new Dog();
			d.sound();
			d.eat();
			//d.Animal();    // Constructor cannot inherit
			//d.legs();      // Private method cannot inherit
			d.Taste();
			Cat c = new Cat();
			c.sound1();
			c.eat();
		}
	    
	}
	class Dog extends TestInheritance
	{
		void sound()
		{ 
		    System.out.println(i);	
			System.out.println("Dog Bark");
		}
	}
	class Cat extends TestInheritance
	{
		void sound1()
		{
			System.out.println("Cat Mew");
		}
	}
	 class TestInheritance
	{
		 int i=1;
		 	void eat ()
		 	{
		 		System.out.println("They also eat");
		 	}
		 	TestInheritance()
		 	{
		 		System.out.println("Constructor");
		 	}
		 	private void legs()
		 	{
		 		System.out.println("Private member cannot inherit");
		 	}
		 	public void Taste()
		 	{
		 		System.out.println("Static method can inherit but not static variable");
		 		System.out.println(i);
		 	}
	}
