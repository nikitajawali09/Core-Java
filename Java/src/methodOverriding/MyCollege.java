package methodOverriding;

class College
{
	void collegeName()
	{
		System.out.println("Name of my college is PIET");
	}
	
	void estYear()
	{
		System.out.println("It was established in 2019");
	}
}

public class MyCollege extends College
{
	protected void estYear()
	{
		System.out.println("It was established in 2001");
	}

	public static void main(String[] args) 
	{
		MyCollege m=new MyCollege();
		m.estYear();
		m.collegeName();		
	}
}
