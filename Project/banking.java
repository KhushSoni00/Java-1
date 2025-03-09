package Project;

import java.util.Scanner;

public class banking {

    static int initailAmount = 1000;
    public static void main(String[] args) {

//----- --- Initializing --- -----//
while (true) {
    System.out.println("Enter your choise = ");
    System.out.println("1:Create a new Account");
    System.out.println("2: Account details");
    System.out.println("3: Withdraw Amount");
    System.out.println("4: Deposit Amount");
    System.out.println("5:Exit");

    Scanner death = new Scanner(System.in);
    int choise = death.nextInt();
    death.nextLine(); 
    switch (choise) {


        case 1:
            createNewAccount();
            break;


        case 2:
            accountDetails();
            break;


        case 3:
            withdrawMoney();
            break;


        case 4:
            depositMoney();
            break;

        case 5:
            System.out.println("Exiting...");
            return;


            default:
            System.out.println("Server error try later !!");
            break;
        }
    }
}



//--- -- create a new account -- ---//
   static void createNewAccount() {

    Scanner die = new Scanner(System.in);

    System.out.print("Enter Your account name = ");
    String nameOfHolder =  die.nextLine();

    int accountNumber = (int) (Math.random() * 90000) + 10000;
    

    System.out.println("Your Account Name = "+nameOfHolder);
    System.out.println("Your Account Number = " + accountNumber);
    System.out.println("Initial Bank balance = "+initailAmount);
    }

//--- -- account details block -- ---//
    static void accountDetails(){
    Scanner die = new Scanner(System.in);


    System.out.print("Enter your name = ");
    String nameCard = die.nextLine();

    System.out.print("Enter your account number = ");
    int accountNumber = die.nextInt();
    
    System.out.print("Your balance = "+initailAmount);

    System.out.println();

    System.out.println("Your name = "+nameCard);
    System.out.println("Your account number = "+accountNumber);
    System.out.println("Bank Balance = "+initailAmount);
   }

//--- -- Withdraw Money block -- ---//
   static void withdrawMoney(){
    accountDetails();
    System.out.println();
    Scanner die = new Scanner(System.in);
    System.out.println("Enter the amount You want to withdraw = ");
    int withdraw = die.nextInt();

    if (withdraw <= initailAmount) 
    {
        initailAmount = initailAmount - withdraw;
        System.out.println("Successfull!!");
        System.out.println("now your balance = "+initailAmount);
    }
    else
    {
        System.out.println("Insufficient Balance!!");
    }
   }

//--- -- Deposit Money block -- ---//
   static void depositMoney(){
    accountDetails();

    Scanner die = new Scanner(System.in);
    System.out.println("Enter the amount you want to deposit");
    int deposit = die.nextInt();

    initailAmount = deposit + initailAmount;
    // System.out.println("Your Name = " +nameCard);
    System.out.println("Your Balance = "+initailAmount);
    
   }
}