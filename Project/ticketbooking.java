package Project;

import java.util.Scanner;

public class ticketbooking {
    public static void main(String[] args) {
        Scanner die = new Scanner(System.in);

        System.out.println("Choose the movie :- ");
        System.out.println("1:Deadpool v/s Wolverine ");
        System.out.println("2:SuperCops");
        System.out.println("3:Zack synder's Batman v/s Superman ");
        System.out.println("4:Zack synder's The Justice League ");
        System.out.println("5:ZOOM 100 ");
        System.out.println("6:Sonu ke Titu ki Sweety!");
        System.out.println("7:Maharaja");
        System.out.println("8:Auron Mein Kaha Dum Tha");
        System.out.println("9:Shaitan");

        int ticketBook = die.nextInt();

        switch (ticketBook) {
            case 1:
                System.out.println("You've booked for Deadpool v/s Wolverine ");
                break;
            case 2:
                System.out.println("You've booked for SuperCops ");
                break;
            case 3:
                System.out.println("You've booked for Zack synder's Batman v/s Superman ");
                break;
            case 4:
                System.out.println("You've booked for Zack synder's The Justice League ");
                break;
            case 5:
                System.out.println("You've booked for ZOOM 100 ");
                break;
            
            case 6:
                System.out.println("You've booked for Sonu ke Titu ki Sweety! ");
                break;
            
            case 7:
                System.out.println("You've booked for Maharaja");
                break;
            
            case 8:
                System.out.println("You've booked for Auron Mein Kaha Dum Tha ");
                break;
            
            case 9:
                System.out.println("You've booked for Shaitaan ");
                break;
                
                
            default:
                System.out.println("Server Error!!");
                break;
        }

        System.out.println("Enter the number of persons - ");
        int numberOfPerons = die.nextInt();
        die.nextLine(); // Add this line to consume newline left-over

        String[] nameOfCustomers = new String[numberOfPerons];
        int[] seatNumbers = new int[numberOfPerons];

        for (int i = 0; i < numberOfPerons; i++) {
            System.out.print("Enter name of person " + (i + 1) + " = ");
            nameOfCustomers[i] = die.nextLine();
        }

        System.out.print("You're tickets are booked for: ");
        for (String name : nameOfCustomers) {
            System.out.print(name + ", ");
        }
        System.out.println();

        int noramlSeat = 150;
        int balconySeat = 450;
        int premiumseat = 900;

        System.out.println("Choose your seat");
        System.out.println("1:Normal seat cost is " + noramlSeat);
        System.out.println("2:Balcony seat cost is " + balconySeat);
        System.out.println("3:Premium seat cost is " + premiumseat);

        System.out.print("Enter your Seat Type = ");
        int chooseSeatType = die.nextInt();

        int totalCharge = 0;

        switch (chooseSeatType) {
            case 1:
                totalCharge = numberOfPerons * noramlSeat;
                break;
            case 2:
                totalCharge = numberOfPerons * balconySeat;
                break;
            case 3:
                totalCharge = numberOfPerons * premiumseat;
                break;
            default:
                System.out.println("Invalid choice");
                break;
        } 

        for (int i = 0; i < numberOfPerons; i++) {
            System.out.print("Enter seat number for " + nameOfCustomers[i] + " = ");
            seatNumbers[i] = die.nextInt();
        }
        System.out.println();
        System.out.println("You're total " + numberOfPerons + " person and the total charge are= " + totalCharge);
        System.out.println("Name/s: " + String.join(", ", nameOfCustomers));
        System.out.print("Seat Numbers: ");
        for (int seat : seatNumbers) {
            System.out.print(seat + " ");
        }
    }
}

