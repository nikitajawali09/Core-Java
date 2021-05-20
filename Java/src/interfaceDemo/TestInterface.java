package interfaceDemo;

interface Bank
{
	float rateOfInterest();
	void loc();
}

class SBI implements Bank
{
	@Override
	public float rateOfInterest() 
	{
		return 7.6f;
	}

	@Override
	public void loc()
	{
		System.out.println("Mumbai|Kolkata|Pune");
	}	
}

class PNB implements Bank
{
	@Override
	public float rateOfInterest() 
	{
		return 5.9f;
	}

	@Override
	public void loc() 
	{
		System.out.println("Goa|Andra Pradesh|Mysore");
	}	
}

public class TestInterface 
{
	public static void main(String[] args) 
	{
		SBI s=new SBI();
	    System.out.println("SBI rate of interest:"+s.rateOfInterest());
		s.loc();
		System.out.println();
		PNB p=new PNB();
	    System.out.println("PNB rate of interest:"+p.rateOfInterest());
		p.loc();
	}
}
