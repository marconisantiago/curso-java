package curso_java_marconi;

import java.util.Scanner;

public class media_numeros_ilimitados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade;
		int i;
		//int idmin=0;
		//int idmax=0;
		int soma;
		double media;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Entre com valor da idade");
		idade= sc.nextInt();
			
		media=0;
		soma=0;
	    i=0;
	    
		while ( idade > 0) {		
		i= i +1;
		soma= soma + idade;
		media= soma/i; 
	    idade= sc.nextInt();
		
		
		}	
		if (idade == 0) {
		   System.out.println("A média do grupo é: " +media);
		   
		   //if (idade < idmin) {
		    	
		    //	idmin= idade;
		    //	 System.out.println("A idade mínima é " +idmin);
		 //  }
		   
		 //  else {
		    //	idmax= a;		   
		     //   System.out.println("A idade máxima é " +idmax);
		 //  }
		}
		  sc.close();
		 }
		

	}


