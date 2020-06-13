package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AccountBank;

public class Programa7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");

		String accountHolder = sc.nextLine();
		System.out.print("Is there de incial deposit (y/n)? ");
		char a = sc.next().charAt(0);
		double balance = 0.0;

		if (a == 'y') {
			System.out.print("Enter initial deposit: ");
			balance = sc.nextDouble();
		}

		AccountBank accountBank = new AccountBank(accountNumber, accountHolder,
				balance);
		System.out.println();
		System.out.println("Account Data:");
		System.out.println(accountBank);
		System.out.println();

		System.out.print("Enter a deposit value: ");
		accountBank.deposit(sc.nextDouble());
		System.out.println("Updated account data:");
		System.out.println(accountBank);
		System.out.println();

		System.out.print("Enter a withdraw value: ");
		accountBank.withdraw(sc.nextDouble());
		System.out.println("Updated account data:");
		System.out.println(accountBank);

		System.out.println();
		System.out.print("Deseja mudar o nome (s/n)? ");
		
		char b = sc.next().charAt(0);
		sc.nextLine();
		if (b == 's') {
			System.out.print("Escreva seu nome: ");
			String name = sc.nextLine();
			accountBank.setAccountHolder(name);

			
			System.out.println("Updated account data:");
			System.out.println(accountBank);

		}

		else {
			System.out.println("Fim do Progama");
		}

		sc.close();
	}
}
