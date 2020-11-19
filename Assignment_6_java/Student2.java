package Assignment6;

class Student1 {
	int rollno;
	 String name;
	 void setData(int rollno,String name) {
		 this.rollno=rollno;
		 this.name=name;
	 }
	 void showData() {
		 System.out.println(rollno);
		 System.out.println(name);
	 }
}
public class Student2 {

	public static void main(String[] args) {
		Student1 stud=new Student1();
		stud.setData(12, "Amol Shinde");
		stud.showData();

	}

}

/*
12
Amol Shinde
*/

