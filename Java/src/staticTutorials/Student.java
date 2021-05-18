package staticTutorials;

public class Student 
{
static int rollNo;
String name;

static
{
	rollNo=0;
}

public Student() 
{
	rollNo=rollNo+1;
}

public static void show()
{
	System.out.println("Roll no:"+rollNo);
}

public void dis()
{
	System.out.println("Name:"+name);
	show();
}

public static void main(String[] args) 
{
	Student s=new Student();
	s.name="Era";
	s.dis();
	System.out.println();
	Student s1=new Student();
	s1.name="Riya";
	s1.dis();
	System.out.println();
	Student s2=new Student();
	s2.name="Ash";
	s2.dis();
}
}
