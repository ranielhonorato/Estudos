import entities.Account;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter the account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter the name of the holder: ");
        sc.nextLine();
        String accountName = sc.nextLine();
        System.out.print("You wish to make an initial deposit of any amount [Y/N]? ");
        char deposit = sc.next().charAt(0);
        if (Character.toLowerCase(deposit) == 'y') {
            System.out.print("Initial deposit value: $ ");
            double initialDeposit = sc.nextDouble();
            account = new Account(accountNumber, accountName, initialDeposit);
        } else {
            account = new Account(accountNumber, accountName);
        }

        System.out.println();
        System.out.println("Data update: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Amount of deposit: $ ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);

        System.out.println();
        System.out.println("Data update: ");
        System.out.println(account);

        System.out.println();
        System.out.println("Tax $ 5.00 per withdraw");
        System.out.print("Amount of withdraw: $ ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);

        System.out.println("Amount withdrawn + the rate: $ " + account.realWithDrawValue(withdraw));

        System.out.println();
        System.out.println("Data update: ");
        System.out.println(account);

        sc.close();
    }
}