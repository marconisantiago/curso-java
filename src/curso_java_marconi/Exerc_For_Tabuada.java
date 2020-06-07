package curso_java_marconi;

import java.util.Scanner;

public class Exerc_For_Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Tabuada: Soma e Multiplicação de 1 até N;

		Scanner sc = new Scanner(System.in);

		// Soma:1 + 1 = 2 Mult: 1 x 1 = 1
		// 1 + 2 = 3 1 x 2 = 2
		// 1 + N = x 1 x N = y

		int N = sc.nextInt();
		int tab = sc.nextInt();
		int soma;
		int mult = 1;

		for (int i = 1; i <= N; i++) {
			switch (tab) {
			case (1):
				soma = tab + i;
				mult = tab * i;

				System.out.println(tab + "+ " + i + " = " + soma + "  " + tab + " x " + i + " = " + mult);

				break;
				
			case (2):
				soma = tab + i;
				mult = tab * i;

				System.out.println(tab + "+ " + i + " = " + soma + "  " + tab + " x " + i + " = " + mult);

				break;
				
			case (3):
				soma = tab + i;
				mult = tab * i;

				System.out.println(tab + "+ " + i + " = " + soma + "  " + tab + " x " + i + " = " + mult);

				break;
				
			case (4):
				soma = tab + i;
				mult = tab * i;

				System.out.println(tab + "+ " + i + " = " + soma + "  " + tab + " x " + i + " = " + mult);

				break;
				
			case (5):
				soma = tab + i;
				mult = tab * i;

				System.out.println(tab + "+ " + i + " = " + soma + "  " + tab + " x " + i + " = " + mult);

				break;
				
			case (6):
				soma = tab + i;
				mult = tab * i;

				System.out.println(tab + "+ " + i + " = " + soma + "  " + tab + " x " + i + " = " + mult);

				break;
				
			case (7):
				soma = tab + i;
				mult = tab * i;

				System.out.println(tab + "+ " + i + " = " + soma + "  " + tab + " x " + i + " = " + mult);

				break;
				
			case (8):
				soma = tab + i;
				mult = tab * i;

				System.out.println(tab + "+ " + i + " = " + soma + "  " + tab + " x " + i + " = " + mult);

				break;
				
			case (9):
				soma = tab + i;
				mult = tab * i;

				System.out.println(tab + "+ " + i + " = " + soma + "  " + tab + " x " + i + " = " + mult);

				break;
				
			case (10):
				soma = tab + i;
				mult = tab * i;

				System.out.println(tab + "+ " + i + " = " + soma + "  " + tab + " x " + i + " = " + mult);

				break;
			}
		}
		sc.close();
	}
}
