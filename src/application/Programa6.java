package application;

import java.util.Locale;
import java.util.Scanner;

import Util.CurrentConverter;

public class Programa6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("What the dollar price? %.2f%n", CurrentConverter.dollarPrice);
		System.out.print("How many dollars Will be bought? ");
		double quantyDollar = sc.nextDouble();
		System.out.printf("Amount to be paid in Reais: %.2f%n", CurrentConverter.amountBePaid(quantyDollar));

		sc.close();
	}

}
