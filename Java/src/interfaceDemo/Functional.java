package interfaceDemo;

interface printable
{
	public abstract void print();
}

public class Functional implements printable
{

	@Override
	public void print() 
	{
		System.out.println("Printing");
	}
	
	public static void main(String[] args) 
	{
		Functional f=new Functional();
		f.print();	
	}
}
