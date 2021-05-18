package inheritance;

class Employee
{
int joiningYear,Id;
String name,gender;
double salary;

void emp()
{
	System.out.println("Employee name:"+name+"|"+"Gender:"+gender+"|"+"Id:"+Id);
	System.out.println("Joining Year:"+joiningYear+"|"+"Salary:"+salary);
}	
}

public class Programmer extends Employee
{
int bonus;
int leaves;
	
double sal()
{
	double finalSalary=salary+bonus;
	System.out.println("Salary with bonus:"+finalSalary);
	return finalSalary;
}

void emp1()
{
	emp();
	System.out.println("Bonus:"+bonus+"|"+"Leaves:"+leaves);
}

public static void main(String[] args) 
{
	Programmer p=new Programmer();
	p.name="Sakshi Mishra";
	p.gender="Female";
	p.Id=122;
	p.salary=15000;
	p.bonus=800;
	p.leaves=17;
	p.joiningYear=2020;
	p.emp1();
	System.out.println();
	Programmer p1=new Programmer();
	p1.name="Raghav Rao";
	p1.gender="Male";
	p1.Id=112;
	p1.salary=13000;
	p1.bonus=600;
	p1.leaves=15;
	p1.joiningYear=2021;
	p1.emp1();
	
}	
}
