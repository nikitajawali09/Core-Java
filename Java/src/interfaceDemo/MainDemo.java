package interfaceDemo;

class A
{
	protected int i=10;
	
	void print()
	{
		System.out.println("I:"+i);
	}	
}

interface C
{
	int j=999;
	abstract void printC();
	
}

interface D
{
	int k=1000;
	abstract void printD();	
}

public class MainDemo extends A implements C,D
{
	public static void main(String[] args)
	{
		MainDemo m=new MainDemo();
		m.print();
		m.printC();
		m.printD();		
	}

	@Override
	public void printD() 
	{
		System.out.println("K:"+k);		
	}

	@Override
	public void printC() 
	{
		System.out.println("J:"+j);
	}
}
