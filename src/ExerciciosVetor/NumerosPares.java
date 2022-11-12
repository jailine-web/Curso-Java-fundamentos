package ExerciciosVetor;

import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n;
		
		System.out.println("Quantos números deseja digitar? ");
		n = ler.nextInt();
		int pares = 0;
		double[] numeros = new double[n];
		
		for(int i = 0; i<numeros.length;i++) {
			System.out.print("Digite um número: ");
			numeros[i] = ler.nextDouble();
		}
		
		System.out.println();
		System.out.println("*** Números positivos ***");
		for(int i = 0; i<numeros.length; i++) {			
			if(numeros[i]%2 == 0) {
				System.out.println(numeros[i]);
				pares ++;
			}
		}
		System.out.println();
		System.out.println("Quantidade de pares: "+ pares);
		
	}
}
