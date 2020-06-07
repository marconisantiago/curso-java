package application;

import java.util.Scanner;

import entities.Employes;

public class Programa4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Employes employes = new Employes ();
		System.out.print("Name: ");
		employes.name = sc.nextLine();		
		System.out.print("Gross Salary: ");		
		employes.grossSalary = sc.nextDouble();		
		System.out.print("Taxi: ");
		employes.taxi = sc.nextDouble();		
				
		System.out.println();
		System.out.println("Employe: " + employes);
		
		System.out.println();
		System.out.print("Wich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employes.increasySalary(percentage);
		
		System.out.println();
		System.out.println("Updated Data " + employes);		
		
		
		
		sc.close();

	}

}
