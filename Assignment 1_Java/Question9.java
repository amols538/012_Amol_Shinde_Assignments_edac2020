//Question9
import java.util.Scanner;

public class Question9 
{

	public static void main(String[] args) 
	{
		Scanner n=new Scanner(System.in);
		System.out.println("Enter Number of days : ");
		int days=n.nextInt();
		if(days==365)
		{
			//days=days%365;
			System.out.println("years="+1);
			//days=days/365;
		}
		else
		{
			int yrs=days/365;                              //670/365=1
			System.out.println("years=" +yrs);
			days=days%365;
			int months=days/31;                            //305/31=9
			System.out.println("months=" +months);
			int month=days%31;                             //305%31=26
			int weeks=month/7;                             //26/7=3
			System.out.println("Weeks = "+weeks);
			
			int day=month%7;                               //26%7=5
			System.out.println("days = "+day);
			
		}
		
	
		n.close();

	}

}
//Output
/*
Enter Number of days : 
670
years=1
months=9
Weeks = 3
days = 5
*/