package interfaceDemo;

interface i1
{
	String firstName="Rohan";
	String lastName="Yadav";	
	void m1();
}

interface i2
{
	String qualifications="BE";
	int age=22;
	
	void m2();
}

public class Implementation implements i1,i2
{
	public static void main(String[] args) 
	{
		Implementation i=new Implementation();
		i.m1();
		i.m2();	
	}

	@Override
	public void m2() 
	{
		System.out.println("First name:"+firstName+"|"+"Last name:"+lastName);
	}

	@Override
	public void m1() 
	{
		System.out.println("Qualifications:"+qualifications+"|"+"Age:"+age);
	}
}
