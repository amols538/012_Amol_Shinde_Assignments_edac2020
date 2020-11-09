//Question4
import java.util.Scanner;

public class Question4
{   
    	public static void main( String[] args ) 
    	{
    		Scanner sc =new Scanner(System.in);
    		System.out.println("12+22+32+..+n2");
    		System.out.println("Enter n value");
    		int n=sc.nextInt();
    		int w=n*10+2;
		    int i,sum=0;
		for(i=12;i<=w;i=i+10)
		{
			System.out.print(i);
			if(i<102)
				if(i==w) {
					break;
					
				}
				System.out.print("+");
			sum = sum + i;
		}
		System.out.print("\n Sum is : " + sum);
		sc.close();
    	}
}
//Output
/*
12+22+32+..+n2
Enter n value
8
12+22+32+42+52+62+72+82
Sum is : 294
*/