package staticTutorials;

public class TestDemo 
{
static int age;
static String name;

static void dis()
{
	System.out.println("Name:"+name+"|"+"Age:"+age);
}

static
{
	name="Deepak";
}
	
	public static void main(String[] args) 
	{
		TestDemo.age=12;
		TestDemo.dis();	
	}
}
