//Question11
import java.util.Scanner;

public class Question11 
{

	public static void main(String[] args) 
	{
		Scanner n=new Scanner(System.in);
		System.out.print("Enter 2 numbers :");
		int n1=n.nextInt();
		int n2=n.nextInt();      //3 2
		System.out.print("Before Swapp : ");
		System.out.print(n1+" "+n2);
		int n3=0;
		n3=n1;                   //n3=3
		n1=n2;                   //n1=2
		n2=n3;                   //n2=3
		System.out.println();
		System.out.print("After Swapp : ");
		System.out.print(n1+" "+n2);
		n.close();

	}

}
//output
/*

Enter 2 numbers :2
3
Before Swapp : 2 3
After Swapp : 3 2
*/