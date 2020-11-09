//Question7

import java.util.Scanner;

public class Question7 
{
	static int percentage(int a,int b,int c,int d,int e)
	{
		int per=((a+b+c+d+e)*100)/500;
		return per;	
	}
	void display(int k) 
	{
		System.out.print("Percentage marks= "+k+" %");
	}
	
	public static void main(String[] args) 
	{
		
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter Marks of subjects : ");
		int maths=s1.nextInt();
		int science=s1.nextInt();
		int history=s1.nextInt();
		int eco=s1.nextInt();
		int marathi=s1.nextInt();
		int res=percentage(maths,science,history,eco,marathi);
		Question7 q7=new Question7();
		q7.display(res);
		s1.close();	

	}
		

}
//output
/*
Enter Marks of subjects : 
99
99
99
99
99
Percentage marks= 99 %
*/