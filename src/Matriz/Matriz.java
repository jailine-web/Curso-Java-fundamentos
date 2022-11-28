package Matriz;

import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual o tamanho da matriz");
		int n = ler.nextInt();
		
		int[][] matriz = new int[n][n];
		
		System.out.println("Digite os números: ");
		
		for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j<matriz[i].length; j++) {
				matriz[i][j] = ler.nextInt();
				
			}
		}
		int cont = 0;
		
		for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j<matriz[i].length; j++) {
				if(matriz[i][j]<0) {
					cont ++;
				}
			}
		}
		
		System.out.println();
		System.out.println("Diagonal:");
		for(int i = 0; i<matriz.length; i++) {				
				System.out.println(matriz[i][i]);
			}

		
		System.out.println("\nNúmeros negativos digitados: "+cont);
	}

}
