//Question13
import java.util.Scanner;

public class Question13 
{
	static float grossSalary(float a,float b,float c)
	{
		float gs=a+b+c;
		return gs;
	}
	void display(float h)
	{
		System.out.print("Gross salary of employee : "+ h);
	}

	public static void main(String[] args) 
	{
		Scanner n=new Scanner(System.in);
		System.out.print("Enter Basic salary of employee : ");
		int Salary=n.nextInt();
		if(Salary<10000)
		{
			float hra=(10*Salary)/100;
			float da=(90*Salary)/100;
			System.out.println("HRA= "+hra);
			System.out.println("DA= "+da);
			float Gs=grossSalary(Salary,hra,da);
			Question13 q13=new Question13();
			q13.display(Gs);	
		}
		else
		{
			float hra=2000;
			float da=(98*Salary)/100;
			System.out.println("HRA= "+hra);
			System.out.println("DA= "+da);
			float Gs=grossSalary(Salary,hra,da);
			Question13 q13=new Question13();
			q13.display(Gs);
		}
		n.close();
		
	}
		
}
/*
Enter Basic salary of employee : 12000
HRA= 2000.0
DA= 11760.0
Gross salary of employee : 25760.0
*/