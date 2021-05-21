package polymorphism;

public class StaticPoly 
{
	void sum(int x,int y)
	{
		int s=x+y;
		System.out.println("Addition of 2:"+s);
	}
	
	void sum(int x,int y,int z)
	{
		int s=x+y+z;
		System.out.println("Addition of 3:"+s);
	}

	public static void main(String[] args) 
	{
		StaticPoly s=new StaticPoly();
		s.sum(20,10);
		s.sum(10,10,20);
	}
}
