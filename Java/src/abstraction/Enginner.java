package abstraction;

abstract class Employee
{
	private String name;
	private int id;
	
	public Employee(String name,int id) 
	{
		this.name=name;
		this.id=id;
	}
	
	public void m1()
	{
		System.out.println("Name:"+name+"|"+"Id:"+id);
	}
	
	public abstract double salary(double sal,int bonus);
}

public class Enginner extends Employee
{
private String position;
	public Enginner(String name, int id,String position) 
	{
		super(name, id);
		this.position=position;	
	}

	public static void main(String[] args) 
	{
		Enginner e=new Enginner("Nikita", 464,"Trainee Enginner");
		e.m1();
		e.salary(25000.6, 760);
	}

	@Override
	public double salary(double sal,int bonus)
	{
		double salary=sal+bonus;
		System.out.println("Salary:"+salary);
		return salary;
	}
	
	public void m1()
	{
	   super.m1();
	   System.out.println("Position:"+position);
	}
}
