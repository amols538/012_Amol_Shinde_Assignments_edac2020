//Question6
package Amol;

import java.util.Scanner;

public class Question6 
{
	static double pi=3.14;
	static double area(float p) 
	{
		
		System.out.print("Area of circle is :");
		double ans=pi*p*p;
		
		return ans;
		
	}
	static double circumferance(double q) 
	{
		System.out.println();
		System.out.print("Circumferance of circle is :");
		double cir=2*pi*q;
		return cir;
		
		
	}
	void display(double ans)
	{
		System.out.print(ans);
	}

	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		System.out.print("Enter the radius : ");
		float r=s1.nextFloat();
		Question6 q6=new Question6();
		double result=area(r);
		q6.display(result);
		double result1=circumferance(r);
		q6.display(result1);
		s1.close();
		
	}

}
/*
//output
Enter the radius : 5
Area of circle is :78.5
Circumferance of circle is :31.400000000000002
*/