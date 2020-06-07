package curso_java_marconi;

import java.util.Scanner;

public class Diferença_Produto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		int d= sc.nextInt();
		
		int x = (a*b) - (c*d);
		
		System.out.println("A diferença do produto é " + x);

	}

}
