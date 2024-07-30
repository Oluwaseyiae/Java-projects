import java.text.NumberFormat;
import java.util.*;

public class BankApp {

    //        Steps
//        1. Have an array of user with their name, account ID, Pin, Account balance
//        2. The users will be able to create account, check balance, deposit, withdraw and exit the program.
//        3. The user will have to use their pin to login. If the pin is correct, their Acc no, name and balance will be shown.
//        4. The user will be asked for the operation to be performed and then proceed.
//    public class BankApp {
//     public class Account{}
//     public class Back{}
//     public static void main(String[] args){}
//    }
//        5. When the operation has been executed, the user will have an option to exit or continue.


    // Account Class
    public static class Account{
        private String accountNumber;
        private String accountName;
        private String accountPin;
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        private double accountBalance;


        public Account(String accountNumber, String accountName, String accountPin, double accountBalance) {
            this.accountNumber = accountNumber;
            this.accountName = accountName;
            this.accountPin = accountPin;
            this.accountBalance = accountBalance;
        }

        // Deposit cash
        public void deposit(double amount) {
            if (amount > 0) {
                accountBalance += amount;
                System.out.println("Deposited " + amount + " to " + accountName + "." + "\nYour account balance is now " + accountBalance);
            } else {
                System.out.println("The amount you're about to deposit is too small.");
            }
        }

        // Withdraw cash
        public void withdraw(double amount) {
            if (amount > 0 && accountBalance > amount) {
                accountBalance -= amount;
                System.out.println("Withdrew" + amount + ". "+ "\nYour account balance is now " + accountBalance);
            } else {
                System.out.println("Insufficient funds or Invalid input. Try again!");
            }
        }

        // Getters and Setters for accountNumber, accountName and accountBalance if needed
        public String getAccountNumber() {
            return accountNumber;
        }

        public String getAccountName() {
            return accountName;
        }

        public Double checkBalance() {
            return accountBalance;
        }

        // Get account details at once
        public String getAccountDetails() {
            String Balance = nf.format(accountBalance) ;
            return "\nAccount Number: " + accountNumber + "\n" +
                    "Account Name: " + accountName + "\n" +
                    "Account Balance: " + Balance;
        }

    }

    //22038632  2567
    // Bank Class
    public static class Bank{
        private Map<String, Account> accounts;
        private static final String ACCOUNT_NUMBER_PREFIX = "2203";
        private Random random;

        public Bank() {
            accounts = new HashMap<>();
            random = new Random();
        }

        public void createAccount(String accountName, String accountPin, double initialDeposit) {

            String accountNumber = generateAccountNumber();
            Account newAccount = new Account(accountNumber, accountName, accountPin, initialDeposit);
            accounts.put(accountNumber, newAccount);
            System.out.println("A new account has been created" + newAccount.getAccountDetails());

        }

        public Account findAccount(String accountNumber) {
            return accounts.get(accountNumber);
        }

        public boolean doesAccountExist(String accountNumber) {
            return accounts.containsKey(accountNumber);
        }
        public boolean  doesAccountPinExist(String accountPin){
            return accounts.containsKey(accountPin);
        }

        public void deposit(String accountNumber, String accountPin, double amount) {
            if (doesAccountExist(accountNumber) && doesAccountPinExist(accountPin)) {
                Account account = findAccount(accountNumber);
                if (account != null) {
                    account.deposit(amount);
                    System.out.println("Deposited " + amount + ". Your new balance is" + checkBalance(accountNumber, null));
                }
            }else {
                System.out.println("Account not found.");
            }
        }

        public void withdraw(String accountNumber, String accountPin, double amount) {
            if (doesAccountExist(accountNumber) && doesAccountPinExist(accountPin)) {
                Account account = findAccount(accountNumber);
            if (account != null) {
                account.withdraw(amount);
            }
            }else {
                System.out.println("Account not found.");
            }
        }

        public double checkBalance(String accountNumber, String accountPin) {
            if (doesAccountExist(accountNumber) && doesAccountPinExist(accountPin)) {
                Account account = findAccount(accountNumber);
                if (account.equals(accountNumber)) {
                    return account.checkBalance();
                }
            }
            System.out.println("Account not found.");
            return 0;

        }

        private String generateAccountNumber() {
            // Generate a random 4-digit number
            int randomNumber = 1000 + random.nextInt(9000);
            return ACCOUNT_NUMBER_PREFIX + randomNumber;
        }

    }


    // User interface
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("WELCOME TO THRIVELINK BANK!");
        System.out.println("We are glad that you chose to bank with us.");
        System.out.println("You can perform the following operations on this app: Create an account, Check Account balance, Deposit and Withdraw.");
        System.out.println("Please choose an operation");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Check Balance");
        System.out.println("5. Exit");


        int choice = scanner.nextInt();
        scanner.nextLine();

        String accountNumber;
        String accountPin;
        double amount;

        switch (choice) {

            case 1:
                System.out.println("Enter Your name: ");
                String accountName = scanner.nextLine();
                System.out.println("Enter a four digit pin (This will be your passcode): ");
                accountPin = scanner.nextLine();
                System.out.println("Enter initial deposit:");
                double initialDeposit = scanner.nextDouble();
                bank.createAccount(accountName,accountPin ,initialDeposit);
                break;
            case 2:
                System.out.println("Enter account number:");
                accountNumber = scanner.nextLine();
                System.out.println("Enter your pin: ");
                accountPin = scanner.nextLine();
                if (bank.doesAccountExist(accountNumber) && bank.doesAccountPinExist(accountPin)) {
                    System.out.println("Enter deposit amount:");
                    amount = scanner.nextDouble();
                    bank.deposit(accountNumber, accountPin ,amount);
                }else {
                    System.out.println("Account not found.");
                }
                break;
            case 3:
                System.out.println("Enter account number:");
                accountNumber = scanner.nextLine();
                System.out.println("Enter your pin: ");
                accountPin = scanner.nextLine();
                if (bank.doesAccountExist(accountNumber) && bank.doesAccountPinExist(accountPin)) {
                    System.out.println("Enter withdraw amount:");
                    amount = scanner.nextDouble();
                    bank.withdraw(accountNumber,accountPin, amount);
                }else {
                    System.out.println("Account not found.");
                }
                break;
            case 4:
                System.out.println("Enter account number:");
                accountNumber = scanner.nextLine();
                System.out.println("Enter your pin: ");
                accountPin = scanner.nextLine();
                if (bank.doesAccountExist(accountNumber) && bank.doesAccountPinExist(accountPin)) {
                    double balance = bank.checkBalance(accountNumber, null);
                    System.out.println("Account balance: " + balance);
                }else {
                    System.out.println("Account not found.");
                }
                break;
            case 5:
                exit = true;
                System.out.println("Exiting the Bank App. Thank you!");
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
        scanner.close();
    }

}
