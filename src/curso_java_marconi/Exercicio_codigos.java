package curso_java_marconi;

import java.util.Scanner;

public class Exercicio_codigos {

	public static void main(String[] args) {
		// TODO Auto-generated method stubS
		Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		while (codigo != 4) {

			switch (codigo) {
			case (1):
				alcool += 1;
				break;
			case (2):
				gasolina += 1;
				break;
			case (3):
				diesel += 1;
				break;

			}
			codigo = sc.nextInt();
		}

		System.out.println("Muito Obrigado");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();
	}

}
