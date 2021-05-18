package staticTutorials;

public class Max 
{
static int a=20;
static int b=30;
int a1=2;

public Max() 
{
	a=2;
}

static
{
	System.out.println("2nd static block");
	b=40;
}

static
{
	System.out.println("1st static block");
}

static void dis()
{
	System.out.println("A:"+a+"|"+"B:"+b);
}

void show()
{
	dis();
	System.out.println("A1:"+a1);
}

	public static void main(String[] args) 
	{
		Max m=new Max();
		m.show();
	}
}
