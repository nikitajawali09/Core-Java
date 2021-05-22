package methodOverriding;

class Organization
{
	int probessionPeriod;
	int casualLeaves;
	String qualification;
	
	public void setPolicy()
	{
		System.out.println("Probession Period:"+probessionPeriod);
		System.out.println("Casual Leaves:"+casualLeaves);
		System.out.println("Qualification:"+qualification);
	}
}

public class OrganizationDemo extends Organization
{
String certification;

public void setPolicy()
{
	System.out.println("Probession Period:"+probessionPeriod +" months");
	System.out.println("Casual Leaves:"+casualLeaves);
	System.out.println("Qualification:"+qualification);
	System.out.println("Certification:"+certification);
}
	
	public static void main(String[] args) 
	{
		OrganizationDemo o=new OrganizationDemo()	;
		o.casualLeaves=23;
		o.probessionPeriod=12;
		o.qualification="BE/Btech(Any branch)";
		o.certification="Web developer";
		o.setPolicy();
	}
}
