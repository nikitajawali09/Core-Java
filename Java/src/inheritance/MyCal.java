package inheritance;
class Cal
{
	public void add(int x,int y)
	{
		int z=x+y;
		System.out.println("Addition of 2:"+z);
	}
	
	public void sub(int m,int n)
	{
		int o=m-n;
		System.out.println("Substraction of 2:"+o);
	}
}	

public class MyCal extends Cal
{
	public void add(int x,int y,int z)
	{
		int a=x+y+z;
		System.out.println("Addition of 3:"+a);
	}
	
	public void sub(int x,int y,int z)
	{
		int a=x-y-z;
		System.out.println("Substraction of 2:"+a);
	}
	
public static void main(String[] args) 
{
	MyCal c=new MyCal();
	c.add(12, 20);
	c.add(12, 10, 15);
	c.sub(12, 1);
	c.sub(20, 10, 15);

}
}
