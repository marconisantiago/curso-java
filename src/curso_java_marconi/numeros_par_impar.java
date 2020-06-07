package curso_java_marconi;

import java.util.Scanner;

public class numeros_par_impar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Entre com o valo de a: ");		
		a= sc.nextInt();
		
		int b= a % 2;		
		if ( b == 0) {	
			
		System.out.println("O Número é Par ");
		
		}
		else {
		System.out.println("O número é Impar");	
		
		}
		
		sc.close();
		

	}

}
