//Fazer um programa para ler dois números inteiros, depois ler a matriz contendo números inteiros, podendo haver repetições. Em seguida, ler um número inteiro que pertence à matriz. Para cada ocorrência de X, mostrar os valores à esquerda, acima, à direita e abaixo de X, quando houver.

package program;

import java.util.Scanner;

public class Matz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		int[][] mat = new int[m][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}

		}

		int val = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == val) {
					System.out.print("Position " + i + ", " + j + ": ");
					System.out.println();
					
					if (j > 0) {
						System.out.println("Down: " + mat[i+1][j]);
					} 
					
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					
					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					
					if (i < mat.length - 1) {
						System.out.println("Left: " + mat[i][j-1]);
						System.out.println();
					}
				}
			}
		}
		sc.close();
	}
}
