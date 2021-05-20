package interfaceDemo;

import java.util.Scanner;

interface Shared
{
	int YES=1;
	int NO=2;
	int MAYBE=3;
	int NEVER=4;
	int LATER=5;
	int SOON=6;
}

public class Question implements Shared
{	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter choice:");
		int result=sc.nextInt();
		switch (result) {
		case 1:
			System.out.println("NO:"+NO);
			break;
			
        case 2:
        	System.out.println("YES:"+YES);
			break;
			
        case 3:
			System.out.println("NEVER:"+NEVER);
			break;
			
        case 4:
        	System.out.println("LATER"+LATER);
        	break;
        	
        case 5:
        	System.out.println("MAYBE:"+MAYBE);
        	break;
        	
		default:
			System.out.println("No such choices");
			break;
		}
		
	}
}
