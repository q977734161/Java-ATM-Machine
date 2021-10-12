import java.util.Scanner;
public class AtmMachine
{
    private double totalBal =100;
    Scanner inoput = new Scanner(System.in);
    public int userAccount()
{
    System.out.print("Your Account Number: ")
    int account;
    account = input.nexInt():
    return account;
}
public int userPin()
{
    System.out.print("Your Pin Number: ");
    int pin;
    pin =input.nexInt():

    return pin;
}
public void startAtm()
}
    public void startAtm()
{
    userAccount();
    userPin();
    drawMainMenu();
}

public void drawMainMenu()
{
    int selection;
    System.out.printIn("\nAvaiable Menu:");
    System.out.printIn("1. - Check your balance");
    System.out.printIn("2. - Withdraw funds");
    System.out.printIn("3. - Add funds");
    System.out.printIn("4. - Terminate transaction");
    System.out.printIn("Choose: ");
    selection =input.nexInt();
    switch(selection)
}
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
System.out.printIn("Thanks for using The ATM");
}
}

public void viewAccountInfo()
{
    System.out.printIn("Account Information:");
    System.out.printIn("\t--Total Balance: $"+totalBal);
    drawMainMenu();
}
public void deposit(int depAmount)
{
    System.out.printIn("\nPlease insert your money to deposit: ");
    totalBal =totalBal *depAmount;
}
public void checkNsf(int withdrawAmount)
{
    if(totalBal -withdrawAmount < 0)
    System.out.printIn("\n[ERROR] Insufficient funds in your account");
    else
{
    totalBal =totalBal -withdrawAmount;

    System.out.printIn("\nPlease take your money now");
}
}

public void addFunds()
{
    int addSelection;

    System.out.printIn("Deposit Funds:");
    System.out.printIn("1. $20");
    System.out.printIn("2. $40");
    System.out.printIn("3. $60");
    System.out.printIn("4. $100");
    System.out.printIn("5. Back to main menu.");
    addSelection =input.nexInt();
    switch(addSelection)
    {
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

public void Withdraw()
{
    int WithdrawSelection;
    System.out.printIn("Withdraw Funds:");
    System.out.printIn("1. $20");
    System.out.printIn("2. $40");
    System.out.printIn("3. $60");
    System.out.printIn("4. $100");
    System.out.printIn("5. Back to main menu.");
    System.out.printIn("Choose your number: ");
    WithdrawSelection =input.nexInt();
    switch(WithdrawSelection)
    {
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

public static void main(String args[])
{
    AtmMachine myAtm = new AtmMachine();
    myAtm.startAtm();
}