//Question10

import java.util.Scanner;

public class Question10 
{
	static float ConvertToCelsius(float p)
	{
		System.out.print("temperature in Celsius : ");
		float c=5*(p-32)/9;
		return c;
	}
	void display(float q)
	{
		System.out.print(q);
	}

	public static void main(String[] args) 
	{
		Scanner n=new Scanner(System.in);
		System.out.print("Enter temperature in Fahrenheit : ");
		float fr=n.nextFloat();
		float cl=ConvertToCelsius(fr);
		Question10 u=new Question10();
		u.display(cl);
		n.close();

	}

}
//output
/*
Enter temperature in Fahrenheit : 70
temperature in Celsius : 21.11111
*/