package ExerciciosVetor;

import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.println("Quantos números deseja digitar? ");
		
		int n = ler.nextInt();
		
		int[] pares = new int[n];
		int npares = 0;
		int media  = 0;
		int soma = 0;
		for(int i = 0; i < pares.length; i++) {
			System.out.print("Digite um número: ");
			pares[i] = ler.nextInt();
			
		}
		
		for(int i = 0; i < pares.length; i++) {
			
			if(pares[i] %2 == 0) {				
				npares ++;
				soma += pares[i];
			} 
		}
		if (npares == 0) {
			System.out.println("\nNenhum número par foi digitado!");
		}
		media = soma/npares;
		System.out.println("Média dos pares: " + media);
	}

}
