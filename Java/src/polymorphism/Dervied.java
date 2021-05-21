package polymorphism;

class Base
{
	void m1()
	{
		System.out.println("In base m1");
	}
}

public class Dervied extends Base
{

	void m1()
	{
		System.out.println("In dervied m1");
	}
	
	void m2()
	{
		System.out.println("In dervied m2");
	}
	
	public static void main(String[] args)
	{
		Dervied d=new Dervied();
		d.m1();
		d.m2();
		System.out.println();
		Base b=new Dervied();
		b.m1();
		
	}
}
