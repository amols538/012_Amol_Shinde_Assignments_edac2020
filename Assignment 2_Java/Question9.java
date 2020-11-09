//Question9-Write a program to search an element in the array.

import java.util.*;
class Matrix
{
	protected void dispaly(int[] a,int c)
	{
		
		for(int i=0;i<c;i++)
		{
			System.out.println("arr["+i+"]"+" = "+a[i]);
		}
	}
	protected void searchArray(int[] r,int e,int size)
	{
		int i=0;
		boolean flag=false;
		for(i=0;i<size;i++)
		{
			if(r[i]==e)
			{
				flag=true;
				break;
			}
			else
			{
				flag=false;
			}
			
		}
		
		if(flag==true)
		{
			System.out.println("element found at :"+i);
		}
		else
		{
			System.out.println("element Not found in array");
		}
		
		
	}
}
public class Question9 {

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
		Matrix m1=new Matrix();
		m1.dispaly(arr, m);
		System.out.println("Enter element to be search in array :");
		int t=s9.nextInt();
		m1.searchArray(arr,t,m);
                s9.close();
			
	}

}
//Output
/*
Enter number of element of array : 
5
Enter element of array : 
1
3
8
6
7
Array Elements are :
arr[0] = 1
arr[1] = 3
arr[2] = 8
arr[3] = 6
arr[4] = 7
Enter element to be search in array :
6
element found at :3
*/