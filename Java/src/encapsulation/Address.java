package encapsulation;

public class Address 
{
private String city;
private int pincode;
private String country;
private String street;

public void setCity(String city)
{
	this.city=city;
}

public String getCity()
{
	return city;
}

public void setPincode(int pincode)
{
	this.pincode=pincode;
}

public int getPincode()
{
	return pincode;
}

public void setCountry(String country)
{
	this.country=country;
}

public String getCountry()
{
	return country;
}

	public static void main(String[] args) 
	{
		Address a=new Address();
		a.city="Mumbai";
		a.country="India";
		a.pincode=421001;
		a.street="Mahatma chaaki";
		System.out.println("City:"+a.city+" "+"Country:"+a.country+" "+"Pincode:"+a.pincode+" "+"Street:"+a.street);
		System.out.println();
		Address a1=new Address();
		a1.setCity("Hyderbad");
		a1.setCountry("India");
		a1.setPincode(211057);
		a1.setStreet("Bala marker road");
		System.out.println("City:"+a1.city+" "+"Country:"+a1.country+" "+"Pincode:"+a1.pincode+" "+"Street:"+a1.street);
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
}
