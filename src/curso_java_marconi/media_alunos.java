package curso_java_marconi;

import java.util.Scanner;

public class media_alunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double nota1;
		double nota2;
		double nota3;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Entre com os valores das Notas");
		
		nota1= sc.nextDouble();
		nota2= sc.nextDouble();
		nota3= sc.nextDouble();
		
		double media= (nota1 + nota2 + nota3)/ 3;
		
		if (media >=7 && media <= 9.9 ) {
			System.out.println("Aluno Aprovado: Media " +media);
		}
		if (media <7) {
			System.out.println("Aluno Reprovado: Media " +media);
		}
		if (media == 10) {
			System.out.println("Aprovado com Louvor: Media " +media);
		}
		
        sc.close();
	}

}
