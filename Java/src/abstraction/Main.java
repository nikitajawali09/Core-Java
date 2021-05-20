package abstraction;

abstract class MyTest
{
	public abstract void test(int x,int y);
}

class Add extends MyTest
{
	@Override
	public void test(int x, int y) 
	{
		System.out.println("Addition:"+(x+y));
	}
}

class Sub extends MyTest
{
	@Override
	public void test(int x, int y) 
	{
		System.out.println("Substraction:"+(x-y));
	}	
}

class Mul extends MyTest
{
	@Override
	public void test(int x, int y) 
	{
		System.out.println("Multiplication:"+(x*y));
	}
}

public class Main 
{
	public static void main(String[] args) 
	{
		Add a=new Add();
		a.test(20,10);
		Sub s=new Sub();
		s.test(11, 5);
		Mul m=new Mul();
		m.test(20,2);
	}
}
