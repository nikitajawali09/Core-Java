package methodOverriding;

class Vehicle
{
	int prize=7000;
	public void run()
	{
		System.out.println("Run method");
	}
}

public class Bike extends Vehicle
{
int prize=6000;

public void run()
{
	System.out.println("Bike price now:"+prize);
	System.out.println("Bike price before:"+super.prize);
}


public static void main(String[] args) 
{
	
	Bike b=new Bike();
	b.run();
	
}
}
