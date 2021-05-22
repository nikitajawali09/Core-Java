package methodOverriding;

class A
{
	int i,j;
	
	A(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	
	void show()
	{
		System.out.println("I:"+i+"|"+"J:"+j);
	}
}

public class B extends A
{
int k;	
	B(int i, int j,int k) 
	{
		super(i, j);
	    this.k=k;
	}
	
	void show()
	{
		System.out.println("I:"+i+"|"+"J:"+j+"|"+"K:"+k);
	}

	public static void main(String[] args) 
	{
		B b=new B(60,80,70);
	    b.show();
	  
	}
}
