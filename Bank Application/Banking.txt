//Menu Driven Program For bank Application
package bank;
import java.util.Scanner;
public class Banking {

      public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            int Choice;
            boolean stop = false;
            float bal = 0f;
            long acc_no= 555333200;

            do {

                  System.out.println("1. ->Deposit money");
                  System.out.println("2. ->Withdraw money");
                  System.out.println("3. ->Balance");
                  System.out.println("4. ->New Account ");
                  System.out.print("Touch a option above ");
                  Choice = in.nextInt();
                  /* do
                   {if (Choice == 0)

                        stop = true;
                   }while(!stop);*/
                

                  switch (Choice) {

                  case 1:
                      float amount;
                      System.out.print("Amount to deposit: ");
                      amount = in.nextFloat();                    //accepted amount
                      bal = bal + amount;
                      break;

                  case 2:

                        System.out.print("Amount to withdraw: ");
                        amount = in.nextFloat();                  
                        bal=bal-amount;
                        break;
        
                  case 3:

                        System.out.println("Your balance: $" + bal);
                        break;
                        
                  case 4:
                      System.out.println("Welcome to Bank of Maharashtra: ");
                      long adhar_no;
                      //String pan_no;
                      
                      System.out.println("Enter your adhar card no:  ");
                      adhar_no = in.nextLong();
                      Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
                      System.out.println("Enter Pan Card Number : ");  
                      String pan_no= sc.nextLine();
                      System.out.println("Enter Name :");
                      String name=sc.nextLine();
                      
                      
                      System.out.print("Enter amount to deppsit : ");
                      int depo = sc.nextInt();
                      if(depo>=1000)
                      {
                          
                          System.out.println("Your Account No is : "+acc_no);
                          acc_no= acc_no + 1;
                          System.out.println("Account holder Name : "+name);
                          System.out.println("Congratulations ! Kindly Visit nearest branch to verify documents ");
                          System.out.println("Your Transection Completed.");
                          System.out.println("Have a nice day !");
                          break;
                      }
                      else
                      {
                          System.out.println("Your deposit is less than 1000 rupees.");
                          System.out.println("Your Deposite amount must be minimum 1000 Rupees");
                          System.out.println("Your Transection Completed.");
                          System.out.println("Have a nice day !");
                      }
                      
                      break;
                      
                     
                  case 0:

                        stop = true;

                        break;

                  default:

                        System.out.println("Wrong choice.");

                        break;

                  }

                  System.out.println();

            } while (!stop);

            System.out.println("Your Transection Completed. Take your Card");
            System.out.println("Have a nice day !");

      }

}

////////////////////////////////////////   OUTPUT    ////////////////////////////////////////

/*
1. ->Deposit money
2. ->Withdraw money
3. ->Balance
4. ->New Account 
Touch a option above 4
Welcome to Bank of Maharashtra: 
Enter your adhar card no:  
125789321
Enter Pan Card Number : 
ASSS51654
Enter Name :
Amol Shinde
Enter amount to deppsit : 1200
Your Account No is : 555333200
Account holder Name : Amol Shinde
Congratulations ! Kindly Visit nearest branch to verify documents 
Your Transection Completed.
Have a nice day !

1. ->Deposit money
2. ->Withdraw money
3. ->Balance
4. ->New Account 
Touch a option above 1
Amount to deposit: 5000

1. ->Deposit money
2. ->Withdraw money
3. ->Balance
4. ->New Account 
Touch a option above 2
Amount to withdraw: 2000

1. ->Deposit money
2. ->Withdraw money
3. ->Balance
4. ->New Account 
Touch a option above 3
Your balance: $3000.0

1. ->Deposit money
2. ->Withdraw money
3. ->Balance
4. ->New Account 
Touch a option above 4
Welcome to Bank of Maharashtra: 
Enter your adhar card no:  
8750315333
Enter Pan Card Number : 
AS78D23697D0G
Enter Name :
Amol Shinde
Enter amount to deppsit : 500
Your deposit is less than 1000 rupees.
Your Deposite amount must be minimum 1000 Rupees
Your Transection Completed.
Have a nice day !

1. ->Deposit money
2. ->Withdraw money
3. ->Balance
4. ->New Account 
Touch a option above 4
Welcome to Bank of Maharashtra: 
Enter your adhar card no:  
8120234577
Enter Pan Card Number : 
NM7823K078K
Enter Name :
Pooja mehta
Enter amount to deppsit : 2000
Your Account No is : 555333201
Account holder Name : Pooja mehta
Congratulations ! Kindly Visit nearest branch to verify documents 
Your Transection Completed.
Have a nice day !

1. ->Deposit money
2. ->Withdraw money
3. ->Balance
4. ->New Account 
Touch a option above 
*/