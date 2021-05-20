package interfaceDemo;

public class Marker implements Cloneable
{
int id;
String name,address;

public Marker(int id,String name,String address) 
{
	this.id=id;
	this.name=name;
	this.address=address;
}

public static void main(String[] args) throws ClassNotFoundException, CloneNotSupportedException
{
Marker m=new Marker(111,"Sakshi", "Kalyan");	
System.out.println("Id:"+m.id+"|"+"Name:"+m.name+"|"+"Address:"+m.address);	

Marker m1=(Marker)m.clone();
System.out.println("Id:"+m1.id+"|"+"Name:"+m1.name+"|"+"Address:"+m1.address);	


}
}
