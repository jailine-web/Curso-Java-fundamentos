package ExerciciosVetor;

import java.util.Scanner;

public class Negativos {
	
	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de números que deseja digitar: ");
		int n = ler.nextInt();
		
		double[] vetor = new double[n];
	
		for(int i =0; i<vetor.length; i++ ) {
			System.out.print("Digite um número: ");
			vetor[i] = ler.nextDouble();
			
		}
		
		System.out.println("\nNúmeros negativos digitados:\n5");
		for(int i = 0; i<vetor.length; i++) {
			
			if(vetor[i]<0) {			
				System.out.println(vetor[i]);
			}
		}
		
		ler.close();
	}
	}
