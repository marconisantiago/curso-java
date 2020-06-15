package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.LerIdades;

public class ProgrIdade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 2;

		List<LerIdades> list = new ArrayList<>();
		LerIdades resultado = new LerIdades();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Idade#: " + (i + 1) + "= ");
			int idade = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			list.add(new LerIdades(idade, name));
			resultado.setSoma(idade);

		}
		
		int menorIdade= list.get(0).getIdade();
        String name = list.get(0).getName();
        
		for (int i = 1; i < list.size(); i++) {

			if (menorIdade > list.get(i).getIdade()) {
				menorIdade = list.get(i).getIdade();
                name =list.get(i).getName();
				
			}
		}

		System.out.println("Soma:= " + resultado.getSoma());

		System.out.println("Menor Idade é: " + menorIdade) ;
		System.out.println("Name: " + name);
		sc.close();
	}
}
