package interfaceDemo;

interface Continent
{
	void continent(String continent);
}

interface Country
{
	void country(String country);
}

interface State
{
	void state(String state);
}

public class City implements Continent,Country,State
{
	public static void main(String[] args) 
	{
		City c=new City();
		c.continent("Asia");
		c.country("India");
		c.state("Maharashtra");
		System.out.println();
		City c1=new City();
		c1.continent("South Africa");
		c1.country("Cape Town");
		c1.state("Africa");
	}

	@Override
	public void state(String state) 
	{
		System.out.println("State:"+state);
	}

	@Override
	public void country(String country) 
	{
		System.out.println("Country:"+country);
	}

	@Override
	public void continent(String continent)
	{
		System.out.println("Continent:"+continent);
	}
}
