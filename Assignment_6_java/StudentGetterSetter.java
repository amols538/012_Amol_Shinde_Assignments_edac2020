package Assignment6;
	class Student{
		private int rollno;
		private String name;
		public void setRollNo(int r) {
			rollno=r;
		}
		public int getRollNO() {
			return rollno;
		}
		public void setName(String s) {
			name=s;
		}
		public String getName() {
			return name;
		}
	}
	public class StudentGettterSetter {

		public static void main(String[] args) {
			Student sgs=new Student();
			sgs.setRollNo(00012);
	        sgs.setName("Amol Shinde");
	        
	        System.out.println(sgs.getRollNO());
	        System.out.println(sgs.getName());
		}

	}

/*

10
Amol Shinde

*/