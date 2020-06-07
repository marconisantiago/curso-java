package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Studente;

public class Programa5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Studente studente = new Studente();
		studente.name = sc.nextLine();
		studente.notaSem1 = sc.nextDouble();
		studente.notaSem2 = sc.nextDouble();
		studente.notaSem3 = sc.nextDouble();

		System.out.println("Final Grade: " + studente.notaFim());

		if (studente.notaFim() >= 60) {

			System.out.println("PASS");

		} else {

			double faltaPontos = studente.missingPoint();
			System.out.println("Final Grade: " + studente.notaFim());
			System.out.println("Failde");
			System.out.println("MISSING POINT: " + faltaPontos);

		}
		sc.close();

	}

}
