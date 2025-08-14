import java.util.*;

public class Task3 {
    int sum = 0;
    int maximum = 100000;
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Task3 dp = new Task3();

        System.out.println("********Welcome to ATM********");
        while (true) {
            System.out.println();
            System.out.println();
            System.out.println("Choose one of the options from below");
            System.out.println("1.Deposit    2.Withdraw    3.Check Balance    4.Close your account");

            Scanner scc = new Scanner(System.in);
            int a = scc.nextInt();

            if (a == 1) {

                dp.Deposit();

            } else if (a == 2) {

                dp.Withdraw();

            } else if (a == 3) {

                dp.Balance();

            } else if (a == 4) {
                System.out.println("Your Account is closed successsfully");
                break;
            } else {
                System.out.println("Enter a valid choice");
            }
        }
    }

    public void Deposit() {
        System.out.println("Enter the amount you want to deposit");
        int deposit = sc.nextInt();
        if (sum + deposit > maximum) {
            System.out.println("Money can't be deposited");
            System.out.println("(Maximum balance can't be more than 1 lakh");

        } else {
            sum = sum + deposit;
            System.out.println("Money Deposited successfully!");
        }

    }

    public void Withdraw() {
        System.out.println("Enter the amount you want to withdraw");
        int withdraw = sc.nextInt();
        if (sum < withdraw) {
            System.out.println("Insufficient Balance");

        } else {
            sum = sum - withdraw;
            System.out.println("Money withdrawn successfully!");
        }
    }

    public void Balance() {
        System.out.println("Your current balance is :" + sum);
    }

}