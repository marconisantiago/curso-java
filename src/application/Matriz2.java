package application;

import java.util.Scanner;

public class Matriz2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] mat = new int[n][m];//inicializa a Matriz  de 2 elementos
       //laço for para leitura da matriz
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				mat[i][j] = sc.nextInt();//Entrada dados da Matriz

			}
		}

		System.out.println();
      // Declaração das variáveis do programa
		int x = sc.nextInt();
		int left = 0;
		int right = 0;
		int down = 0;
		int up = 0;
		int y = 0;
		int z = 0;
      //Laço for para verificação das saidas do programa
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (mat[i][j] == x) {
					y = i;
					z = j;
					System.out.println();
					System.out.println("Position: " + y + "," + z);
					
					if (mat[i][0] != x) {
						left = mat[i][j - 1];
						System.out.println("left " + left);
                        left=0;
					}
					if (mat[i][m - 1] != x) {
						right = mat[i][j + 1];
						System.out.println("Right " + right);
						right = 0;

					}
					if (mat[0][j] != x) {
						up = mat[i - 1][j];
						System.out.println("Up: " + up);
						up = 0;
					}
					if (mat[n - 1][j] != x) {
						down = mat[i + 1][j];
						System.out.println("Down: " + down);
						down =0;
					}					

				}

			}

		}
		
		
		sc.close();
	}
}