package curso_java_marconi;

import java.util.Scanner;

public class Exercicios_Whilw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
				
		while (senha != 2002) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Liberado");
		
        sc.close();
	}

}
