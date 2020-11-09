//Question14
import java.util.Scanner;

public class Question14 
{

	public static void main(String[] args) 
	{
		Scanner n=new Scanner(System.in);
		System.out.print("Enter year : ");
		int year=n.nextInt();
		if(year%400==0)                          //1600
		{
			System.out.print(year+" is leap year");
			
		}
		else if((year%4==0) && (year%100!=0))
		{
			System.out.print(year+" is leap year");
			
		}
		else
		{
			System.out.print(year+" is not a leap year");
		}
		
		n.close();

	}

}
/*
Enter year : 2022
2022 is not a leap year
*/