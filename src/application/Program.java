package application;

import java.util.Scanner;

import entities.Triangule;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Triangule x,y;
		x= new Triangule();
		y= new Triangule();
		

		System.out.println("Entre com os valores do triandulo x");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com os valores do triandulo y");
		y.a= sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();		
		double areaY = y.area();

		System.out.printf(" A area de x = %.2f%n", areaX);
		System.out.printf(" A area de y = %.2f%n", areaY);

		if (areaX > areaY) {
			System.out.println("O Triangulo x é maior que y");
		} else {
			System.out.println("O Triangulo y é maior que x");

		}
		sc.close();

	}

}
