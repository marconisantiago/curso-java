package curso_java_marconi;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Soma N�meros Inteiros
		
		int a;
		int b;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Entre com valores de a e b");
				
        a= sc.nextInt();
        b= sc.nextInt();
              
        int soma= a+b;
        System.out.println("O Valor da Soma �: " +soma);
       
        sc.close();  
      
	}

	    
}
