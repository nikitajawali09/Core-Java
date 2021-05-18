package inheritance;

class Members
{
	private String name,number,batch;
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}

	public String getNumber() 
	{
		return number;
	}

	public void setNumber(String number) 
	{
		this.number = number;
	}

	public String getBatch() 
	{
		return batch;
	}

	public void setBatch(String batch) 
	{
		this.batch = batch;
	}
}

class PartTime extends Members
{
	int yearOfJoining;
	private int hourlyPay=600;
	
	public int getHourlyPay(int noOfHours) 
	{
		System.out.println("Total ctc:"+(hourlyPay*noOfHours));
		return hourlyPay*noOfHours;
	}
	
	public void setHourlyPay(int hourlyPay) 
	{
		this.hourlyPay = hourlyPay;
	}
}

public class EmpTest extends PartTime
{
	public static void main(String[] args) 
	{
		EmpTest e=new EmpTest();
		e.yearOfJoining=2019;
		e.setBatch("Manager");
		e.setHourlyPay(4000);
		e.setName("Monu Singh");
		e.setNumber("9786857575");
		System.out.println("----------Employee Details------------");
		System.out.println("Name:"+e.getName()+"|"+"Batch:"+e.getBatch());
		System.out.println("Joining Year:"+e.yearOfJoining+"|"+"Phone number:"+e.getNumber());
		System.out.println("Total working hours:"+e.getHourlyPay(7));
		
	}
}
