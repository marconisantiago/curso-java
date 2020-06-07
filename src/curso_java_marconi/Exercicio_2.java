package curso_java_marconi;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Converter graus Celsius em graus Farhenight
		
		double c; // Declaração variável
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Entre com valor de C:");
		
		c= sc.nextDouble();// Inicializa a variável C
		
	    double f= (9*c + 160)/5;
	    System.out.println("O Valor de F é:" +f);
	    
	    sc.close();
	    
	    

	}

}
