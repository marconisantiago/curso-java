package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Intervalos;

public class ProgramList2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = 5;
		List<Intervalos> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.print("Numero#:" + (i + 1) + " ");
			int numero = sc.nextInt();
			list.add(new Intervalos(numero));

		}
		int a = 0;
		int b = 0;
		int c = 0;
		List<Integer> valoresA = new ArrayList<>();
		List<Integer> valoresB = new ArrayList<>();
		List<Integer> valoresC = new ArrayList<>();

		for (int j = 0; j < list.size(); j++) {

			if (list.get(j).getNumero() <= 50) {
				a += 1;
				valoresA.add(list.get(j).getNumero());

			}
			if (list.get(j).getNumero() > 50 && list.get(j).getNumero() <= 100) {
				b += 1;
				valoresB.add(list.get(j).getNumero());

			}
			if (list.get(j).getNumero() > 100) {
				c += 1;
				valoresC.add(list.get(j).getNumero());

			}

		}
		System.out.println(list.toString());
		System.out.println("Intervalo <=50:");
		System.out.println(a + " " + "Numero " + valoresA);		
		System.out.println("Intervalo >50 e <=100: ");
		System.out.println(b + " " + "Numero"+ valoresB);
		System.out.println("Intervalo >100: ");
		System.out.println(c + " " + "Numero"+ valoresC);

		sc.close();

	}
}