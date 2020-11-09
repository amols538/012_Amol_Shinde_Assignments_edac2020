package Assignment4;
import java.util.Scanner;

class Interest{
	int principal;
	static double rate;
	double year;
	
	Interest(int p, double r, double y){
		principal=p;
		rate=r;
		 year=y;
	}
	void Calculate(){
		double ans=(principal*rate*year)/100;
		 System.out.print("Simple Interest="+ans);
	}
	
}

public class Question5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter principal amount,rate and year:(1000 7.8 2):");
        int p=sc.nextInt();
        double r=sc.nextDouble();
        double y=sc.nextDouble();
        Interest si=new Interest(p,r,y);
        sc.close();
        si.Calculate();
	}

}

/*
Enter principal amount,rate and year:(1000 7.8 2):12000
8.5
3
Simple Interest=3060.0
*/