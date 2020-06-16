package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Products;
import entities.enums.OrderStatus;

public class ProgramOrder {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");//Instanciando Data
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();		
		System.out.print("Birth date (DD/MM/YYYY) ");		
		Date birthDate = sdf.parse(sc.next());// Formato para entrada de dados de Data
		
		Client client = new Client(name, email, birthDate);//instanciando objeto "client"
		
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());//Entrada dados Class "num"
		
		Order order = new Order(new Date(), status, client);//instanciando objeto Order

		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();

		Products product = new Products(productName,productPrice);//Instanciando Product

			System.out.print("Quantity: ");
			int quantity = sc.nextInt();

		OrderItem orderItem = new OrderItem(quantity, productPrice, product); //instanciando ordemItem

			order.addItem(orderItem);
		}

		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);

		
		
		
        sc.close();
	}

}
