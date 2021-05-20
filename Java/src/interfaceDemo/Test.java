package interfaceDemo;

interface Draw
{
	public static void draw()
	{
		System.out.println(Draw.addCircleAndRect(0,0));
	}

	public static double addCircleAndRect(int i, int j) 
	{
		double area=i*j;
		System.out.println("Area:"+area);
		return area;
	}	
	
	public abstract double formula(int length,int breath);
}

class Circle implements Draw
{

	@Override
	public double formula(int length,int breath) 
	{
		double circle=(length+breath)*2;
		System.out.println("Circle:"+circle);
		return circle;
	}
}

class Rectangle implements Draw
{
	@Override
	public double formula(int length,int breath) 
	{
		double rect=(length+breath)/2;
		System.out.println("Rectangle:"+rect);
		return rect;
	}
}

public class Test extends Rectangle
{
	public static void main(String[] args) 
	{
		Rectangle r=new Rectangle();
		r.formula(20,10);
		Circle c=new Circle();
		c.formula(11,5);
	    Draw.addCircleAndRect(20,100);		
	}
}
