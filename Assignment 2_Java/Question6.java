//Queston6
import java.util.Scanner;
public class Question6 {
	public static void avg(float a)
	{
		float average=0;
		average=a/10;
		display(average);
	}
	public static void display(float b)
	{
		System.out.println("Average = "+b);
	}

	public static void main(String[] args) {
		Scanner s4=new Scanner(System.in);
    	System.out.print("Enter Array element:");
    	int arr[]=new int[10];
    	for(int i=0;i<10;i++)
    	{
    		arr[i]=s4.nextInt();
    	}
    	System.out.print("Array is : ");
    	for(int i=0;i<10;i++)
    	{
    		System.out.println("  a["+i+"]"+ "="+arr[i]);
    	}
    	System.out.println("Sum of array : ");
    	float sum=0;
		for(int i=0;i<10;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum :"+sum);
		avg(sum);
    		
    	


	}

}
//Output
/*
Enter Array element:10
11
12
13
14
15
16
17
18
19
Array is :   a[0]=10
  a[1]=11
  a[2]=12
  a[3]=13
  a[4]=14
  a[5]=15
  a[6]=16
  a[7]=17
  a[8]=18
  a[9]=19
Sum of array : 
Sum :145.0
Average = 14.5
*/