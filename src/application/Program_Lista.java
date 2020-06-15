package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employe;


public class Program_Lista {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employes will be registered? ");
		int n = sc.nextInt();

		List<Employe> list = new ArrayList<>();
		
		//Employe[] vect = new Employe[n];

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Employe #" + (i+1) + ":");
			System.out.print("ID: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employe(id, name, salary)) ;
		}	
			System.out.print("Enter the employee id that will have salary increase : ");
			int id = sc.nextInt();
			boolean encontrouId = false;
			for (int j = 0; j < list.size(); j++) {
				if(list.get(j).getId() == id){
					System.out.print("Enter the percentege ");
					double perc = sc.nextDouble();
					list.get(j).inSalary(perc);
					encontrouId = true;
				}
				
			}
			 if (encontrouId == false){
				 System.out.println("This id does not exist!");
			 }
			
		//	list.get(arg0)
			

			// for (String x : list) {
			// System.out.println(x);
		
		System.out.println();
		System.out.println("Print List:");
		//for (int i = 0; i <= 3; i++) {
			//if (vect[i] != null) {
				//System.out.println(vect[i]);
			//}

		//}
		
		//for (int i = 0; i < vect.length; i++) {
			//list.add(vect[i]);
			
	//	}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		sc.close();
	}
}
