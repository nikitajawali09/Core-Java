package methodOverriding;

class Employee
{
	int id,basicSalary,ta,da,hra,grossSalary;
	String name;
	
	public Employee(int id, int basicSalary, String name) 
	{
		this.id = id;
		this.basicSalary = basicSalary;
		this.name = name;
	}
	
	public void dis()
	{
		System.out.println("Id:"+id+"|"+"Name:"+name+"|Salary:"+basicSalary);
		System.out.println("Ta:"+ta+"|"+"Hra:"+hra+"|"+"Da:"+da);
	}
	
	public int grossSalary()
	{
		grossSalary=basicSalary+hra+da+ta;
		return grossSalary;		
	}
	
	public void setInc()
	{
		ta=(int)(0.1*basicSalary);
		hra=(int)(0.2*basicSalary);
		da=(int)(0.24*basicSalary);
	}	
}

public class Manager extends Employee
{
	String depName;
	double fa,pa;

	public Manager(int id, int basicSalary, String name)
	{
		super(id, basicSalary, name);	
	}
	
	public void setInc()
	{
		super.setInc();
		fa=0.05*basicSalary;
		pa=0.03*basicSalary;
	}
	
	public void dis()
	{
		super.dis();
		System.out.println("Fa:"+fa+"|"+"Pa:"+pa);
	}
	
	public static void main(String[] args) 
	{
		Manager m=new Manager(11, 57000, "Priya Singh");
		m.ta=200;
		m.hra=500;
		m.pa=700;
		m.da=500;
		m.basicSalary=70000;
		m.fa=89;
		m.pa=100;
		m.dis();
		
	}
}
