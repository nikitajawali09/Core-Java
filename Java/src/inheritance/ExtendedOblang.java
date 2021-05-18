package inheritance;

class Oblang
{
	protected double len,bre;
	public Oblang(double len,double bre) 
	{
		this.len=len;
		this.bre=bre;
	}
	public Oblang()
	{
	System.out.println("Oblang constructor");
	}
	
	public double getArea()
	{
		double area=len*bre;
		return area;
	}
	
	public double getPer()
	{
		double perimeter=2*(len+bre);
		return perimeter;
	}	
}

public class ExtendedOblang extends Oblang
{
	protected double side;
	
	public double getPer(double side)
	{
		return side*bre*len;
	}
	
	public static void main(String[] args) 
	{
		Oblang o=new Oblang();
		o.bre=36.5;
		o.len=25.5;
		System.out.println("Area of oblang:"+o.getArea()+"|"+"Perimeter:"+o.getPer());
		ExtendedOblang e=new ExtendedOblang();
		e.side=47.5;
		System.out.println("Area of extended oblang:"+e.getPer(58.5));	
	}
}
