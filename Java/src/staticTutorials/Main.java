package staticTutorials;

class Test
{
	static int a=2;
	int mul(int a,int b)
	{
		return a*b;
	}
	
	static int add(int a,int b)
	{
		return a*b;
	}
}

public class Main
{
	public static void main(String[] args) 
	{
		Test t=new Test();
		System.out.println("Multiplication:"+t.mul(20, 10));
		System.out.println("Addition:"+Test.add(20, 5));
		System.out.println("A:"+Test.a);
	}
}
