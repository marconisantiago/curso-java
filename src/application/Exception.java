package application;

import java.util.Scanner;
import model.exceptions.DomainException;
import model.exceptions.Account;

public class Exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit ");
			double withdrawlimit = sc.nextDouble();

			Account account = new Account(number, holder, balance,
					withdrawlimit);

			System.out.println("");
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			account.withdraw(amount);
			
			System.out.println("New balance: " + account.getBalance());
			

		} catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}

		sc.close();
	}

}
