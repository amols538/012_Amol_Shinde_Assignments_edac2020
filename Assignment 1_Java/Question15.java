//Question15
import java.util.Scanner;

public class Question15
{

	public static void main(String[] args) 
	{
		Scanner n=new Scanner(System.in);
		System.out.print("Enter your gender ");
		System.out.print("character m for male and f for female :");
		char gen=n.next().charAt(0);
		
		System.out.print("Enter your age ");
		int age=n.nextInt();		
		if(gen=='m' || gen=='M')
		{
			if(age>=21)
			{
				System.out.print("Eligible for marriage ");
			}
			else
			{
				System.out.print("Not eligible for marriage ");
			}
		}
		else if(gen=='f' || gen=='F')
		{
			if(age>=18)
			{
				System.out.print("Eligible for marriage ");
			}
			else
			{
				System.out.print("Not eligible for marriage ");
			}
		}
		else
		{
			System.out.print("Invalid Input ");
		}
		n.close();
		

	}

}
/*
//Output
Enter your gender character m for male and f for female :F
Enter your age 30
Eligible for marriage
*/