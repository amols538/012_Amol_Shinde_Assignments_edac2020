//Question2
import java.util.Scanner;

public class Question2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter number : ");
		int n=sc.nextInt();
		System.out.println("Reverse number is : ");
		do
		{
			int c=n%10;
			System.out.print(c);  //145/10=5     //14%10=4   //1%10=1
			n=n/10;               //145/10=14    //14/10=1
			
		}while(n>0);
		sc.close();

	}

}
//Output
/*
 Enter number : 
12578
Reverse number is : 
87521
*/