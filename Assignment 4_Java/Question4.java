package Assignment4;
import java.util.Scanner;

class Employee {
	int id;
	String name;
	String designation;
	
  Employee(int num,String n,String d) {
	   id=num;
	   name=n;
	   designation=d;
  } 
  void printDetails() {
		System.out.println("ID= "+id);
		System.out.println("name "+name);
		System.out.println("designation "+designation);
		System.out.println();
	}
}

public class Question4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee arr[]=new Employee[5];
        for(int i=0;i<2;i++) {
        	System.out.print("Enter id, name & designation(eg 912 Akshay Manager):");
        	int num=sc.nextInt();
        	String n=sc.next();
        	String d=sc.next();
        	arr[i]=new Employee(num,n,d);
        }
        sc.close();
        String check="Manager";
        for(int i=0;i<2;i++) {
        	if(arr[i].designation.equals(check)) {
        		arr[i].printDetails();
        	}
        }
	}

}



/*
Enter id, name & designation(eg 912 Akshay Manager):1245
Amol
Manager
Enter id, name & designation(eg 912 Akshay Manager):1246
Amar
Manager
ID= 1245
name Amol
designation Manager

ID= 1246
name Amar
designation Manager

*/