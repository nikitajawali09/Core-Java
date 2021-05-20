package abstraction;

abstract class Dog
{
	public abstract void sleep();
	
	public void show()
	{
		System.out.println("Dog is black in color");
	}
}

public class Sound extends Dog
{
	public static void main(String[] args) 
	{
		
		Sound s=new Sound();
		s.show();
		s.sleep();		
	}

	@Override
	public void sleep() 
	{
		System.out.println("Dog is sleeping");
	}
}
