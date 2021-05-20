package interfaceDemo;

interface Animal
{
	interface Dog
	{
		void dog();
	}
	
	interface Cat
	{
		void cat();
	}
}

public class Nested implements Animal.Cat,Animal.Dog
{

	public static void main(String[] args)
	{
		Nested n=new Nested();
		n.dog();
		n.cat();		
	}

	@Override
	public void dog() 
	{
		System.out.println("Dog");
	}

	@Override
	public void cat()
	{
		System.out.println("Cat");
	}
}
