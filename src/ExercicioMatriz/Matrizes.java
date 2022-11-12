package ExercicioMatriz;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o número de linhas: ");
		int linhas = ler.nextInt();
		System.out.print("Digite o número de colunas: ");
		int col = ler.nextInt();

		int mat[][] = new int[linhas][col];

		System.out.println();
		System.out.println("Digite os numeros ");
		

		for(int i = 0; i<mat.length; i++) {
			for(int j = 0; j<mat[i].length; j++) {
				mat[i][j] = ler.nextInt();
		}
		}
		System.out.print("Digite o numero que deseja buscar: ");
		int x = ler.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				

				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		
		
		ler.close();
	}
	
	

}
