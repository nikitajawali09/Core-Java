package stringHandling;

public class Handling
{
public static void main(String[] args) 
{
	String str="fun and funny";
	System.out.println(str);
	System.out.println("Length of str:"+str);
	char charAt=str.charAt(4);
	System.out.println("Character at index 4:"+charAt);
	int indexOf=str.indexOf("f");
	System.out.println("Index of 'f' :"+indexOf);
	int lastIndexOf=str.lastIndexOf("f");
	System.out.println("Last index of 'f':"+lastIndexOf);
	boolean endWidth=str.endsWith("t");
	System.out.println("Ends with with 't':"+endWidth);
	boolean startWidth=str.endsWith("f");
	System.out.println("Starts with 'f':"+startWidth);
	System.out.println("Trim message:"+str.trim());
	System.out.println("Converting into lower case:"+str.toLowerCase());
	System.out.println("Converting into Upper case:"+str.toUpperCase());
    String str1=" & good";
    System.out.println("After concating:"+str.concat(str1));
    System.out.println("Replace 'f' with 'F':"+str.replace('f','F'));
    System.out.println("Compare:"+str.compareTo(str1));
    System.out.println("Compare with ignore case:"+str.compareToIgnoreCase(str1));
    System.out.println("Equals:"+str.equals(str1));
    System.out.println("Equals with ignore case:"+str.equalsIgnoreCase(str1));
    System.out.println("Hashcode:"+str.hashCode());
	System.out.println("Replacing 'n' with 'N':"+str.replaceAll("n","N"));
}
}
