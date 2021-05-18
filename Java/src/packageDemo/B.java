package packageDemo;
import packageDemo.A;
import encapsulation.*;
public class B 
{
	public static void main(String[] args)
	{
		A a=new A();
		a.mesg();	
		encapsulation.Address a1=new encapsulation.Address();
		System.out.println(a1.getCity());
	}
}
