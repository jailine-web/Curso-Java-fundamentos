package ExerciciosVetor;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual a quantidade que deseja digitar? ");
		int qtd = ler.nextInt();
		
		int[] A = new int[qtd];
		int[] B = new int[qtd];
		int[] C = new int[qtd];
		
		System.out.println("Digite os valores do vetor A:");
		for(int i = 0; i<A.length; i ++) {
			A[i] = ler.nextInt();
			
		}
		System.out.println("Digite os valores do vetor B:");
		for(int i = 0; i<A.length; i ++) {
			B[i] = ler.nextInt();
			
		}
		System.out.println("Resultado: ");
		for(int i = 0; i<qtd; i ++) {
			C[i] =  A[i] + B[i];
			System.out.println(C[i]);
		}
	}
}
