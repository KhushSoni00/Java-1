package Project;


/**
 * banksys
 */
import java.util.Scanner;

public class librarysys {
    static int numberOfBooks = 5;
public static void main(String[] args) {
   Scanner defeat = new Scanner(System.in);

   System.out.println("Enter the choice");
   System.out.println("1:Log-in");
   System.out.println("2:Issue book");
   System.out.println("3:Return book");
   System.out.println("4:exit");


   int choose = defeat.nextInt();
   switch (choose) {
    case 1:
        firstBlock();
        break;
    case 2:
    issueBook();
   
    default:
        break;
   }
}

//--- --- first block  --- ---//
static void firstBlock(){
    Scanner defeat = new Scanner(System.in);

    System.out.println("choose what you want to do - ");
    System.out.println("1:Log - In");
    System.out.println("2:Issue Library Card");
    System.out.println("3:Exit...");
    int log = defeat.nextInt();

    switch (log) {

        case 1:
        logIn();            
            break;
        
        case 2:
        librarycard();

        case 3:
        System.out.println("exiting...!");
        break;
        default:
        System.out.println("Server not working");
           break;
    }

}

static void logIn(){

    Scanner defeat = new Scanner(System.in);

    System.out.print("Eneter your name = ");
      String nameCard = defeat.nextLine();
 
    System.out.print("Enter your Card number = ");
    int cardNumber = defeat.nextInt();

    System.out.println("Enter your college Id");
    int collegeId = defeat.nextInt();


    System.out.println("Your name = "+nameCard);
    System.out.println("you card number = "+cardNumber);
    System.out.println("Your College Id = "+collegeId);

}


static void librarycard(){

    Scanner defeat = new Scanner(System.in);
    System.out.println("You want to issue the library card");
    System.out.println("choose what you want ");
    System.out.println("1:Issue card");
    System.out.println("2:Change limit of card");

    int cardIssue = defeat.nextInt();

    switch (cardIssue) {
        case 1:
            firstBlock();
            break;

            case 2:
            System.out.println("enter the book you have = ");
            int bookPublished = defeat.nextInt();

            System.out.println("Enter the number of book you want to issue = ");
            int bookNumber = defeat.nextInt();

            System.out.println("to change your limit");
            int limitOfCard = defeat.nextInt();

            if (bookPublished > numberOfBooks) {
                System.out.println("You can expand the limit ");
            }if (bookNumber>bookPublished) {
                System.out.println("you can either expand or take another book");
            }else{
                System.out.println("You are not allowed...!!");
            }
           
        default:  System.out.println("Server error...!!");
            break;
    }
}

static void issueBook(){   
    Scanner defeat = new Scanner(System.in);

    System.out.println("Enter the number of book you already issued = ");
    int haveBook = defeat.nextInt();

    System.out.println("number of books you want to issue now =  ");
    int wantToIssue = defeat.nextInt();

    if (haveBook <= numberOfBooks) {
        if (wantToIssue < haveBook) {
            System.out.println("you can issue book ");

            int totalBooks = haveBook+wantToIssue;
            System.out.println("Total books = "+totalBooks);
        }
    }else{
        System.out.println("You can't issue book ");
    }
}
}