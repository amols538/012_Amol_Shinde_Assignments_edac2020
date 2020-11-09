//Question5
import java.util.Scanner;

public class Question5 
{

    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter lower value :");
    	int low=sc.nextInt();
    	System.out.println("Enter Higher value :");
    	int high=sc.nextInt();
        while (low < high) {
            boolean flag = false;  //20  //50

            for(int i = 2; i <= low/2; ++i) //i=2 20/2=10
            {
                
                if(low % i == 0)            //20%2==0  //21%3==0 //22%4!=0 //23%5!=0
                {
                    flag = true;            //true
                    break;
                }
            }

            if (!flag && low != 0 && low != 1)  //(f && t && t)=f  
                System.out.print(low + " ");

            ++low;                              //21 //22 //23 //24
        }
    }
}
//Output
/*
Enter lower value :
50
Enter Higher value :
100
53 59 61 67 71 73 79 83 89 97 
*/