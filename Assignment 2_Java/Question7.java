//Question7
import java.util.Scanner;

//7 Sort a ten element array in descending order.
class Bigger{
	public void display(int[] b,int l)
	{
		for(int i=0;i<l;i++)
		{
			System.out.print(b[i]+"\n");
		}
	}
	public void descendingArray(int[] c,int a)
	{
		int p=0;

        for (int i = 0; i < a; ++i) //c[0]=11 i=0
        {
            for (int j = i + 1; j < a; ++j) // j=1 
            {
                if (c[i] < c[j])            //c[0]<c[1]
                {
                    p = c[i];
                    c[i] = c[j];
                    c[j] = p;
                }
            }
        }
        System.out.println("Dsiplay array in Descending array : ");
		Bigger b2=new Bigger();
		b2.display(c, a);
	}
}
public class Question7
{
	public static void main(String[] args) 
	{
		Scanner s5=new Scanner(System.in);
		System.out.println("Enter array length :");
		int m=s5.nextInt();
		System.out.println("Enter array element of "+m+" size: " );
		int arr[]=new int[m];
		for(int i=0;i<m;i++)
		{
			arr[i]=s5.nextInt();
		}
		System.out.println("Array elements are :");
		Bigger b1=new Bigger();
		b1.display(arr, m);
		b1.descendingArray(arr,m);
		
		

	}

}

//Output
/*
Enter array length :
5
Enter array element of 5 size: 
11
22
44
55
33
Array elements are :
11
22
44
55
33
Dsiplay array in Descending array : 
55
44
33
22
11
*/