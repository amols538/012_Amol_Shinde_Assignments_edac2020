//Question8
import java.util.Scanner;

//8.	Write a program to reverse the array elements.
class Reverse
{
	public void dispaly(int[] n,int o)
	{
		for(int i=0;i<o;i++)
		{
			System.out.println("arr["+i+"]= "+n[i]);
		}
	}
	public void rev(int[] t,int start,int end)
	{
		for(int i=end;i>=start;i--)
		{
			System.out.println("arr["+i+"]= "+t[i]);
		}
		//Reverse r2=new Reverse();
		//r2.dispaly(t, end);
	}
	
}
public class Question8 {

	public static void main(String[] args) 
	{
		Scanner s8=new Scanner(System.in);
		System.out.println("Enter Length of array :");
		int m=s8.nextInt();
		int[] arr=new int[m];
		System.out.println("Enter Elements of "+m+" array :");
		for(int i=0;i<m;i++)
		{
			arr[i]=s8.nextInt();
		}
		Reverse r8=new Reverse();
		r8.dispaly(arr, m);
		System.out.println("Reverse array:");
		r8.rev(arr,0,m-1);
		
		

	}

}
//Output
/*
Enter Length of array :
6
Enter Elements of 6 array :
11
33
55
22
44
88
arr[0]= 11
arr[1]= 33
arr[2]= 55
arr[3]= 22
arr[4]= 44
arr[5]= 88
Reverse array:
arr[5]= 88
arr[4]= 44
arr[3]= 22
arr[2]= 55
arr[1]= 33
arr[0]= 11
*/