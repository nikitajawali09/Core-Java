package encapsulation;

public class Student 
{
public int rollNo;
private int physicsMarks;
private int chemistryMarks;
private int mathsMarks;
double sum;

public void setRollNo(int rollNo)
{
	this.rollNo=rollNo;
	getRollNo();
}

public int getRollNo()
{
	System.out.println("Student roll no:"+rollNo);
	return rollNo;
}
	
public void setPhyMarks(int physicsMarks)
{
	this.physicsMarks=physicsMarks;
	getPhyMarks();
}

public int getPhyMarks()
{
	System.out.println("Physics marks:"+physicsMarks);
	return physicsMarks;
}

public void setChemMarks(int chemistryMarks)
{
	this.chemistryMarks=chemistryMarks;
	getChemMarks();
}

public int getChemMarks()
{
	System.out.println("Chemistry marks:"+chemistryMarks);
	return chemistryMarks;
}

public void setMathMarks(int mathsMarks )
{
	this.mathsMarks=mathsMarks;
	getMathMarks();
}

public int getMathMarks()
{
	System.out.println("Maths marks:"+mathsMarks);
	return mathsMarks;
}

public double totalMarks()
{
	sum=mathsMarks+physicsMarks+chemistryMarks;
	System.out.println("Sum of marks :"+sum);
	getPer();
	return sum;
}

public double getPer()
{
	double per=(sum/300)*100;	
	System.out.println("Percentage :"+Math.round(per));
	return per;
}
	
	public static void main(String[] args)
	{
		Student s=new Student();
		s.setRollNo(11);
		s.setChemMarks(78);
		s.setPhyMarks(89);
		s.setMathMarks(76);
		s.totalMarks();	
		System.out.println();
		Student s1=new Student();
		s1.setRollNo(12);
		s1.setChemMarks(88);
		s1.setPhyMarks(78);
		s1.setMathMarks(70);
		s1.totalMarks();
		
	}
}
