//Question1
import java.util.Scanner;

public class Question1 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter number : ");
		int n=sc.nextInt();
		System.out.println("Table of Entered number : ");
		for(int i=1;i<=10;i++)
		{
			int c=0;
			c=n*i;
			System.out.println(n+" * "+ i +"  =  "+c);
			
		}
		sc.close();

	}

}
//Output
/*
 Enter number : 
15
Table of Entered number : 
15 * 1  =  15
15 * 2  =  30
15 * 3  =  45
15 * 4  =  60
15 * 5  =  75
15 * 6  =  90
15 * 7  =  105
15 * 8  =  120
15 * 9  =  135
15 * 10  =  150
*/