package application;

import java.util.Scanner;

import entities.Product;

public class Programa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Product product = new Product();
		System.out.println("Enter product Data");
		System.out.print("Name ");
		product.name = sc.nextLine();
		System.out.print("Price ");
		product.price = sc.nextDouble();
		System.out.print("Quantity ");
		product.quantity = sc.nextInt();

		System.out.println();
		System.out.println("Product Data " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated Data " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated Data " + product);
		
		
		

		sc.close();
	}

}
