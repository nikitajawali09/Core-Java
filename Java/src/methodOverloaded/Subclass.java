package methodOverloaded;

class Superclass
{
	void mesg(String a)
	{
		System.out.println("A:"+a);
	}
}

public class Subclass extends Superclass
{

	void mesg(double x)
	{
		System.out.println("X:"+x);
	}
	
	public static void main(String[] args) 
	{
		Superclass s=new Superclass();
		s.mesg("Nikita");
		Subclass s1=new Subclass();
		s1.mesg(47.7);
	}
}
