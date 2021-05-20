package interfaceDemo;

interface Ex
{
	public abstract void extended();
}


public class Extended implements Ex
{
	@Override
	public void extended() 
	{
		System.out.println("Extended ");
	}
	public static void main(String[] args) 
	{
		Extended e=new Extended();
		e.extended();		
	}
}
