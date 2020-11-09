//Question3
import java.util.Scanner;

public class Question3 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter number : ");
		int n=sc.nextInt();
		//System.out.println("Prime Or Not ");
		boolean flag=false;
		int m=n/2;
		for(int i=2;i<=m;++i)    //33/2=16 //i=2 9/2=4     //i=3 9/2=4 
		{
			//System.out.println(m);
			if(n%i==0)
			{
				flag=true;
				break;
				
			}
		}
		if(!flag) 
		{
			System.out.println(n +" is Prime Number");
		}
		else
		{
			System.out.println(n+ " is not Prime number");
		}
		sc.close();

	}

}
//Output
/*
 Enter number : 
8
8 is not Prime number
 Enter number : 
7
7 is Prime Number
/*