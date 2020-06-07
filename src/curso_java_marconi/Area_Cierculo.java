package curso_java_marconi;

import java.util.Scanner;

public class Area_Cierculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double x = sc.nextDouble();
		
		double area = pi* Math.pow(x,2.0);
		
		System.out.printf("A Área do circulo é: %.2f\n",area);
		
		
		sc.close();		
		
		

	}

}
