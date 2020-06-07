package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangule;

public class Programa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangule rectangule = new Rectangule();
		
		System.out.println("Entre com a Largura  e Altura do Retangulo");
		rectangule.width =sc.nextDouble();
		rectangule.heigth = sc.nextDouble();
		
		
		double area= rectangule.area();
		System.out.println("Area = " +area);
		
		double perimeter= rectangule.perimeter();
		System.out.println("Perimeter = " +perimeter);
		
		double diagonal= rectangule.diagonal();
		System.out.println("Diagonal = " +diagonal);
		
		
		sc.close();
		
		
		
		

	}

}
