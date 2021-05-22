package methodOverriding;

class AB
{
	void m1()
	{
		System.out.println("A-m1");
	}
	
	void m2()
	{
		System.out.println("B-m2");
	}
}

public class BTest extends AB
{
	void m2()
	{
		System.out.println("BTest :-");
	}
	
	public static void main(String[] args) 
	{
		BTest t=new BTest();
		t.m1();
		t.m2();
		
	}
}
