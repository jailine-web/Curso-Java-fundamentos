package ExerciciosVetor;

import java.util.Scanner;

public class SomaVetor {
	
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double soma = 0, media = 0;
		
		System.out.print("Digite quantos n�meros deseja digitar: ");
		int n = ler.nextInt();
		
		double[] vetor = new double[n];
		
		System.out.println();
		
		for(int i = 0; i<vetor.length; i++) {
			System.out.print("Digite um n�mero: ");
			vetor[i] = ler.nextDouble();
			
		}
		
		System.out.println("\nN�meros digitados: ");
		
		
		for(int i = 0; i<vetor.length; i++) {
			
			System.out.println(vetor[i]);
			soma += vetor[i];
			
		}
		
		media = soma/vetor.length;
		
		System.out.printf("\nSoma %.2f: ",soma);
		System.out.printf("\nM�dia %.2f", media);
		
	}
}
