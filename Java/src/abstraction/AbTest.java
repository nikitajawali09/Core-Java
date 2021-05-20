package abstraction;

abstract class AbClass
{
	int x=20;
	public AbClass() 
	{
		System.out.println("In abstract class");
	}
	
	final void m2()
	{
		System.out.println("Final m2 method");
	}
	
	void m3()
	{
		System.out.println("In void m3");
	}
	
	static void m4()
	{
		System.out.println("In static m4");
	}
	
	abstract void show();
}

public class AbTest extends AbClass
{
    public static void main(String[] args)
	{
		AbTest t=new AbTest();
		t.show();
	}

	@Override
	void show() 
	{	
		m4();
		m2();
		m3();
	}
}
