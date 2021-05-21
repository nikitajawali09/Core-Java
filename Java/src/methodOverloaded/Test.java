package methodOverloaded;

public class Test
{
	void test(String a)
	{
		System.out.println("String");
	}
	
	void test(int a)
	{
		System.out.println("Int");
	}
	
	void test(double a)
	{
		System.out.println("Double");
	}	
	
	public static void main(String[] args) 
	{
		Test t=new Test();
		t.test(5.7);
		t.test(4);
		t.test("NJ");
	}
}
