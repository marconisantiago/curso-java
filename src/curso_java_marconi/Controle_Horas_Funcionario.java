package curso_java_marconi;

import java.util.Scanner;

public class Controle_Horas_Funcionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();// Numero do funcionario
		double htrab = sc.nextDouble();//Horas trabalhadas
		double vhora = sc.nextDouble();// Valor da hora
		
		double salario = htrab*vhora; // Calculo do Salario
		
		System.out.println("NUMBER = " +x);
		System.out.println("SALARY = " +salario);
		
		sc.close();
	}

}
