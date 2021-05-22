package methodOverriding;

class AA
{
	void callMe()
	{
		System.out.println("AA's callme");
	}
}

class BB extends AA
{
	void callMe()
	{
		System.out.println("BB's callme");
	}
}

public class C extends BB
{
	void callMe()
	{
		System.out.println("CC's callme");
	}	
	
	public static void main(String[] args)
	{
		AA a=new AA();
		BB b=new BB();
		C c=new C();
		AA r;
		r=a;
		r.callMe();
		r=b;
		r.callMe();
		r=c;
		r.callMe();
		
	}
}
