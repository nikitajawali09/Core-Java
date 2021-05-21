package methodOverloaded;

public class Data
{

	public static void response(String data)
	{
		System.out.println("String:"+data);
	}
	
	public static void response(int data)
	{
		System.out.println("Int:"+data);
	}	

	public static void response(double data)
	{
		System.out.println("Double:"+data);
	}	

	public static void response(char data)
	{
		System.out.println("Character:"+data);
	}
	

	public static void response(Boolean data)
	{
		System.out.println("Boolean:"+data);
	}
		
	public static void main(String[] args) 
	{
		Data.response("Niki");
		Data.response(false);
		Data.response('B');
		Data.response(46);
		Data.response(5.6);
	}
}
