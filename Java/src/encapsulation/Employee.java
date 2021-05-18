package encapsulation;

public class Employee 
{
	private String name;
	private int empNo;
	private String location;
	private double salary;
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setNo(int empNo)
	{
		this.empNo=empNo;
	}
	
	public int getNo()
	{
		return empNo;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	
   public void show()
   {
	   System.out.println("Employee name:"+name+" "+"Location:"+location+" "+"Salary:"+salary+" "+"Employee Id:"+empNo);
   }

	public static void main(String[] args)
	{
		Employee e=new Employee();
		e.setLocation("Mumbai");
		e.setName("Riya Nagar");
		e.setSalary(20000.0);
		e.setNo(1223);
		e.show();
		System.out.println();
		Employee e1=new Employee();
		e1.setLocation("Goa");
		e1.setName("Pari Faurk");
		e1.setSalary(82000.0);
		e1.setNo(1213);
		e1.show();
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
