//Question10-Write the program to find the sum of even elements and sum of odd //elements present in the array of integer type.

import java.util.*;
class Evenodd
{
	protected void dispaly(int[] a,int c)
	{
		
		for(int i=0;i<c;i++)
		{
			System.out.println("arr["+i+"]"+" = "+a[i]);
		}
	}
	protected void evenOdd(int[] r,int size)
	{
		int i=0;
		int even=0;
		int odd=0;
		for(i=0;i<size;i++)
		{
			if(r[i]%2==0)
			{
				even=even+r[i];
			}
			else
			{
				odd=odd+r[i];
			}
		}
		System.out.println("Sum of even elements  :"+even);
		System.out.println("Sum of odd elements  :"+odd);		
	}
}
public class Question10 {

	public static void main(String[] args) {
		Scanner s9=new Scanner(System.in);
		System.out.println("Enter number of element of array : ");
		int m=s9.nextInt();
		int[] arr=new int[m];
		System.out.println("Enter element of array : ");
		for(int i=0;i<m;i++)
		{
			arr[i]=s9.nextInt();
			
		}
		System.out.println("Array Elements are :");
		Evenodd m1=new Evenodd();
		m1.dispaly(arr, m);
		m1.evenOdd(arr,m);
		s9.close();
			
	}

}
//output
/*
Enter number of element of array : 
5
Enter element of array : 
1
2
3
5
6
Array Elements are :
arr[0] = 1
arr[1] = 2
arr[2] = 3
arr[3] = 5
arr[4] = 6
Sum of even elements  :8
Sum of odd elements  :9
*/