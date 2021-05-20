package abstraction;

abstract class Emp
{
	public String name,address,number;
	
	Emp()
	{
		System.out.println("Details of employees");
	}

	public Emp(String name, String address, String number)
	{
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	public void mailCheck()
	{
		System.out.println("Mailing a check to:"+this.name+"|"+this.address+"|"+this.number);
	}
	public abstract void loc(String loc);
	public abstract double salary(double salary);
	
}

public class AbstractDemo extends Emp
{
double hra,da;

public AbstractDemo() 
{
	super();
}
	
	public static void main(String[] args)
	{
		AbstractDemo a=new AbstractDemo();
		a.name="Ramesh Sha";
		a.address="Thane";
		a.loc("Mumbai");
		a.hra=4600;
		a.da=600;
		a.number="9868686758";
		a.salary(50000);
		a.mailCheck();	
	}

	@Override
	public void loc(String loc) 
	{
		System.out.println("Location :"+loc);
	}

	@Override
	public double salary(double salary) 
	{ 
		da=salary*15/100;
		hra=salary*10/100;
		double sal=salary+da+hra;
		System.out.println("Da:"+da+"|Hra:"+hra);
		System.out.println("Total salary:"+sal);
		return sal;		
	}
}
