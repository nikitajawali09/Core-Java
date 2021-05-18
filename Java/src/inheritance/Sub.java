package inheritance;

class Super
{
	int num=10;
	void dis()
	{
		System.out.println("Num:"+num);
	}
}

public class Sub extends Super
{
	
	public void dis(int a)
	{
		super.dis();
		int b=num+a;
		System.out.println("B:"+b);
	}
	
public static void main(String[] args) 
{
	Sub s=new Sub();
	s.dis(23);
	System.out.println();
	s.num=20;
	s.dis(11);
}
}
