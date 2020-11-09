//Question8

import java.util.Scanner;

public class Question8 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle Amount :");
		float p=sc.nextFloat();
		System.out.println("Enter Rate of interst :");
		float r=sc.nextFloat();
		System.out.println("Enter Number of months");
		float n=sc.nextFloat();
		float interest=(p*r*n)/100;

	    System.out.println("Principal: " + p);
	    System.out.println("Interest Rate: " + r);
	    System.out.println("Time Duration: " + n);
		System.out.println("Simple Interest : "+ interest);
		
		sc.close();
		

	}

}
//output
/*
Enter Principle Amount :
5000
Enter Rate of interst :
9
Enter Number of months
24
Principal: 5000.0
Interest Rate: 9.0
Time Duration: 24.0
Simple Interest : 10800.0
*/