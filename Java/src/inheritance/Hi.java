package inheritance;

class Hello
{

Hello()
{
	System.out.println("Hello");
	show();
}

public void show()
{
	System.out.println("Show");
}
}
public class Hi extends Hello
{
	Hi()
	{
		System.out.println("Hi");
		show();
	}
	
	public void show()
	{
		System.out.println("Show 2");
	}

public static void main(String[] args) 
{
	Hello h=new Hello();
	h.show();
	Hi h1=new Hi();
	h1.show();

}
}
