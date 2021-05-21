package methodOverloaded;

public class MainMethod 
{
	public static void main() 
	{
		System.out.println("Without args");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
	}
	
	public static void main(String args) 
    {
		System.out.println("Main with string");
		
	}
}
