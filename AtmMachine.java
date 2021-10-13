import java.util.Scanner;

public class AtmMachine {
    private double totalBal = 100;
    Scanner input = new Scanner(System.in);

    public int userAccount() {
        System.out.print("Your Account Number: ");
        int account;
        account = input.nextInt();
        return account;
    }

    public int userPin() {
        System.out.print("Your Pin Number: ");
        int pin;
        pin = input.nextInt();
        return pin;
    }

    public void startAtm() {
        userAccount();
        userPin();
        drawMainMenu();
    }

    public void drawMainMenu() {
        int selection;
        System.out.println("\nAvaiable Menu:");
        System.out.println("1. - Check your balance");
        System.out.println("2. - Withdraw funds");
        System.out.println("3. - Add funds");
        System.out.println("4. - Terminate transaction");
        System.out.println("Choose: ");
        selection = input.nextInt();
        switch (selection) {
            case 1:
                viewAccountInfo();
                break;
            case 2:
                Withdraw();
                break;
            case 3:
                addFunds();
                break;
            case 4:
                System.out.println("Thanks for using The ATM");
        }
    }

    public void viewAccountInfo() {
        System.out.println("Account Information:");
        System.out.println("\t--Total Balance: $" + totalBal);
        drawMainMenu();
    }

    public void deposit(int depAmount) {
        System.out.println("\nPlease insert your money to deposit: ");
        totalBal = totalBal * depAmount;
    }

    public void checkNsf(int withdrawAmount) {
        if (totalBal - withdrawAmount < 0) {
            System.out.println("\n[ERROR] Insufficient funds in your account");
        } else {
            totalBal = totalBal - withdrawAmount;

            System.out.println("\nPlease take your money now");
        }
    }

    public void addFunds() {
        int addSelection;

        System.out.println("Deposit Funds:");
        System.out.println("1. $20");
        System.out.println("2. $40");
        System.out.println("3. $60");
        System.out.println("4. $100");
        System.out.println("5. Back to main menu.");
        addSelection = input.nextInt();
        switch (addSelection) {
            case 1:
                deposit(20);
                drawMainMenu();
                break;
            case 2:
                deposit(40);
                drawMainMenu();
                break;
            case 3:
                deposit(60);
                drawMainMenu();
                break;
            case 4:
                deposit(100);
                drawMainMenu();
                break;
            case 5:
                drawMainMenu();
                break;
        }
    }

    public void Withdraw() {
        int WithdrawSelection;
        System.out.println("Withdraw Funds:");
        System.out.println("1. $20");
        System.out.println("2. $40");
        System.out.println("3. $60");
        System.out.println("4. $100");
        System.out.println("5. Back to main menu.");
        System.out.println("Choose your number: ");
        WithdrawSelection = input.nextInt();
        switch (WithdrawSelection) {
            case 1:
                checkNsf(20);
                drawMainMenu();
                break;
            case 2:
                checkNsf(40);
                drawMainMenu();
                break;
            case 3:
                checkNsf(60);
                drawMainMenu();
                break;
            case 4:
                checkNsf(100);
                drawMainMenu();
                break;
            case 5:
                drawMainMenu();
                break;
        }
    }

    public static void main(String args[]) {
        AtmMachine myAtm = new AtmMachine();
        myAtm.startAtm();
    }
}