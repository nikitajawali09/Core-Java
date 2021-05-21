package polymorphism;

public class Shape
{
	private void dimension()
	{
		System.out.println("In private method");
	}
	
	static void property()
	{
		System.out.println("In static shape");
	}

public static void main(String[] args) 
{
	Shape s=new Shape();
	s.dimension();
	Shape.property();
}
}
