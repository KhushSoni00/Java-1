package Project;

import java.util.Scanner;

public class library {
    static int intialBooks = 5;
    static String expireCardIn = "Till your college ends!";
    public static void main(String[] args) {

         Scanner defeat = new Scanner(System.in);

        System.out.println("Choose :-");
        System.out.println("1:Log-In");
        System.out.println("2:Change card details");
        System.out.println("3:Issue Library card");
        System.out.println("4:Issue book");
        System.out.println("5:Return Book ");
        System.out.println("6:Check Your Card-detils"); 
        System.out.print("Enter the choice :- ");
        
int choose = defeat.nextInt();
switch (choose) {
    case 1:
        Login();
        break;

    case 3:
        issueLibraryCard();
        break;
    
    case 4:
        issueBook();
        break; 
    case 5:
        returnBook();
        break;
        case 6:
        cardDetils();
        break;
    default:
    System.out.println("Server Down...!!");
    System.out.println("Try Later...");
        break;
   }
    }

//Log - in Case //
    static void Login(){
        Scanner defeat = new Scanner(System.in);

        System.out.print("Enter your name = ");
        String nameCard = defeat.nextLine();
        System.out.print("Enter your scholoar number = ");
        int scholarNumber = defeat.nextInt();
        System.out.print("Enter your library card number = ");
        int libraryNumber = defeat.nextInt();
        System.out.print("Number of books you've issued = ");
        int numberOfBooksIssued = defeat.nextInt();

        System.out.println("Your name  = "+nameCard);
        System.out.println("Your scholar number are = "+scholarNumber);
        System.out.println("Your Library number are = "+libraryNumber);
        System.out.println("Number Of books issued = "+numberOfBooksIssued);
        // System.out.println("Number of books you can issue total = "+intialBooks);
        // System.out.println("Expiration = "+expireCardIn);
        // System.out.println();

    }


//Issue Library card case //
    static void issueLibraryCard(){
        Scanner defeat = new Scanner(System.in);

        System.out.print("Enter your name = ");
        String nameCard = defeat.nextLine();

        System.out.print("Enter your scholoar number = ");
        int scholarNumber = defeat.nextInt();


        int libraryCardNumber = (int) (Math.random() * 90000) + 10000;

        // System.out.print("Number of books you've issued = ");
        // int numberOfBooks = defeat.nextInt();


        System.out.println("Your name  = "+nameCard);
        System.out.println("Your scholar number are = "+scholarNumber);
        System.out.println("Your Library number are = "+libraryCardNumber);
    }
       

//Issue a book //
// Declare intialBooks variable

static void issueBook(){
    Scanner defeat = new Scanner(System.in);
    System.out.print("Enter your name = ");
    String nameCard = defeat.nextLine();
    System.out.print("Enter your scholar number = ");
    int scholarNumber = defeat.nextInt();
    defeat.nextLine(); 
    System.out.print("Enter your library card number = ");
    int libraryNumber = defeat.nextInt();
    defeat.nextLine(); 
    System.out.print("Number of books you've issued = ");
    int numberOfBooksIssued = defeat.nextInt();
    defeat.nextLine(); 
    System.out.println("Enter the number of books you want to issue");
    int wantToIssueBook = defeat.nextInt();
    defeat.nextLine(); 
    
    
    if (numberOfBooksIssued < 3) {
        // Issue books for students with less than 3 books
        if (((numberOfBooksIssued + wantToIssueBook) ) <= intialBooks ){
            System.out.println("You can issue books");
            int totalBooks = wantToIssueBook + numberOfBooksIssued;
            System.out.print("Total books issued are = " + totalBooks);
        } else {
            System.out.println("You cannot issue book ");
        }
    } else if (numberOfBooksIssued >= 1 && numberOfBooksIssued <= 5) {
 
        if ((numberOfBooksIssued + wantToIssueBook) <= 5) {
            System.out.println("You can issue books");
            int totalBooks = wantToIssueBook + numberOfBooksIssued;
            System.out.print("Total books issued are = " + totalBooks);
        // } else {
        //     System.out.println("You cannot issue book ");
        }
    } else {
        System.out.println("You have exceeded the maximum limit");
    }
    
    
    }


// Returning the Books //
      static void returnBook(){
        Scanner defeat = new Scanner(System.in);    
        System.out.print("Enter your name = ");
        String nameCard = defeat.nextLine();
        System.out.print("Enter your scholoar number = ");
        int scholarNumber = defeat.nextInt();
        System.out.print("Enter your library card number = ");
        int libraryNumber = defeat.nextInt();
        System.out.print("Number of books you've issued = ");
        int numberOfBooksIssued = defeat.nextInt();
        System.out.println("Enter the number of book you want to return = ");
        int returningBook = defeat.nextInt();


        int totalBooks = numberOfBooksIssued - returningBook;
        System.out.println("Total books you have now! = "+totalBooks);
        if (numberOfBooksIssued > intialBooks) {
            System.out.println("Penalty can be applied");
        }
      }

    static void cardDetils(){
        Scanner defeat = new Scanner(System.in);

        System.out.print("Enter your name = ");
        String nameCard = defeat.nextLine();
        System.out.print("Enter your scholoar number = ");
        int scholarNumber = defeat.nextInt();
        System.out.print("Enter your library card number = ");
        int libraryNumber = defeat.nextInt();
        System.out.print("Number of books you've issued = ");
        int numberOfBooksIssued = defeat.nextInt();
        System.out.println();
        System.out.println();
    
    

        System.out.println("Your name  = "+nameCard);
        System.out.println("Your scholar number are = "+scholarNumber);
        System.out.println("Your Library number are = "+libraryNumber);
        System.out.println("Number Of books issued = "+numberOfBooksIssued);
        System.out.println("Number of books you can issue total = "+intialBooks);
        System.out.println("Expiration = "+expireCardIn);
        System.out.println();
    }
}
