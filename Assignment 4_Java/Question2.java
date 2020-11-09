public class Question2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Book arr[]=new Book[5];
        for(int i=0;i<5;i++) {
        	System.out.print("Enter id, name & price of book:");
        	int num=sc.nextInt();
        	String n=sc.next();
        	double p=sc.nextDouble();
        	arr[i]=new Book(num,n,p);
        }
        sc.close();
        double maxprice=arr[0].price;
        int maxPriceObj=0;
        for(int i=0;i<5;i++) {
        	if(arr[i].price>=maxprice) {
        		maxprice=arr[i].price;
        		maxPriceObj=i;
        	}
        }
       
        arr[maxPriceObj].printDetails();
	}

}



/*Enter id, name & price of book:1452
Amol
420
Enter id, name & price of book:1453
History
230
Enter id, name & price of book:1454
Maths
560
Enter id, name & price of book:1455
OOPs
320
Enter id, name & price of book:1456
Java
300
Book Id= 1454
name= Maths
Price= 560.0
*/