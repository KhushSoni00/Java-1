import java.util.*;

// BankAccount class for managing each account
class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor to initialize the account
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful! New balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    // Method to transfer money to another account
    public void transfer(BankAccount toAccount, double amount) {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount); // Withdraw from the current account
            toAccount.deposit(amount); // Deposit into the recipient's account
            System.out.println("Transfer successful! Transferred " + amount + " to " + toAccount.getAccountHolderName());
        } else {
            System.out.println("Transfer failed due to insufficient funds or invalid amount.");
        }
    }

    // Method to display account information
    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Holder: " + accountHolderName + ", Balance: " + balance;
    }
}

// BankingSystem class to manage multiple accounts
class BankingSystem {
    private Map<String, BankAccount> accounts;

    // Constructor to initialize the banking system
    public BankingSystem() {
        accounts = new HashMap<>();
    }

    // Method to create a new account
    public void createAccount(String accountNumber, String accountHolderName, double initialBalance) {
        BankAccount newAccount = new BankAccount(accountNumber, accountHolderName, initialBalance);
        accounts.put(accountNumber, newAccount);
        System.out.println("Account created successfully for " + accountHolderName);
    }

    // Method to get an account by account number
    public BankAccount getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    // Method to display all accounts
    public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
        } else {
            for (BankAccount account : accounts.values()) {
                System.out.println(account);
            }
        }
    }
}

// Main program to run the banking app
public class BankingApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankingSystem bankingSystem = new BankingSystem();

        while (true) {
            // Display the menu options
            System.out.println("\n--- Banking System ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. View Balance");
            System.out.println("6. View All Accounts");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    // Create a new account
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("Enter account holder name: ");
                    String accountHolderName = scanner.nextLine();
                    System.out.print("Enter initial balance: ");
                    double initialBalance = scanner.nextDouble();
                    bankingSystem.createAccount(accountNumber, accountHolderName, initialBalance);
                    break;

                case 2:
                    // Deposit money
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextLine();
                    BankAccount depositAccount = bankingSystem.getAccount(accountNumber);
                    if (depositAccount != null) {
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        depositAccount.deposit(depositAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 3:
                    // Withdraw money
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextLine();
                    BankAccount withdrawAccount = bankingSystem.getAccount(accountNumber);
                    if (withdrawAccount != null) {
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawalAmount = scanner.nextDouble();
                        withdrawAccount.withdraw(withdrawalAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    // Transfer money
                    System.out.print("Enter your account number: ");
                    String senderAccountNumber = scanner.nextLine();
                    BankAccount senderAccount = bankingSystem.getAccount(senderAccountNumber);
                    if (senderAccount != null) {
                        System.out.print("Enter recipient account number: ");
                        String recipientAccountNumber = scanner.nextLine();
                        BankAccount recipientAccount = bankingSystem.getAccount(recipientAccountNumber);
                        if (recipientAccount != null) {
                            System.out.print("Enter transfer amount: ");
                            double transferAmount = scanner.nextDouble();
                            senderAccount.transfer(recipientAccount, transferAmount);
                        } else {
                            System.out.println("Recipient account not found.");
                        }
                    } else {
                        System.out.println("Sender account not found.");
                    }
                    break;

                case 5:
                    // View account balance
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextLine();
                    BankAccount balanceAccount = bankingSystem.getAccount(accountNumber);
                    if (balanceAccount != null) {
                        System.out.println("Account balance: " + balanceAccount.getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 6:
                    // View all accounts
                    bankingSystem.displayAllAccounts();
                    break;

                case 7:
                    // Exit the program
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
