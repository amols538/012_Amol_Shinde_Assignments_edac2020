package Assignment6;
import java.util.Scanner;

class Circle1 {
	double radius;
	double area;
	double arearound;
	
	void init(double radius) {
		this.radius=radius;
	}
	void calculateArea() {
		this.area=2*Math.PI*radius;
	}
	void display() {
		System.out.println(area);
		arearound=Math.round(area*100.0)/100.0;
		System.out.println(arearound);
	}
}
public class Circle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter radius:");
		double r=sc.nextDouble();
		sc.close();
		Circle1 c=new Circle1();
		c.init(r);
		c.calculateArea();
		c.display();
	}

}

/*
Enter radius:5
31.41592653589793
31.42
*/