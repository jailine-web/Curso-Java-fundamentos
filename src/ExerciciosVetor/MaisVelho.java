package ExerciciosVetor;

import java.util.Scanner;

public class MaisVelho {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a qtd desejada: ");
		int n = ler.nextInt();
		
		String[] nomes = new String[n];
		int	[] 	idades = new int [n];
		int maisVelha = 0;
		int posicao = 0;
		
		for(int i = 0; i<n; i++) {
			System.out.println("\nDigite os dados da "+ (i+1) +"° pessoa");
			
			System.out.print("Nome: ");
			nomes[i] = ler.next();
			System.out.print("Idade: ");
			idades[i] = ler.nextInt();
			
		}
		System.out.println("\nA pessoa mais velha é: ");
		for(int i = 0; i<n; i++) {
			if(idades[i]>maisVelha) {
				maisVelha = idades[i];
				posicao = i;
			}
		}
		System.out.print(nomes[posicao]);
		
	}

}
