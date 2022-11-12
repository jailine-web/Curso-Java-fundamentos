package Pensionato;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Quantos quartos deseja alugar? ");
		int n = ler.nextInt();
		
		Quartos[] quarto = new Quartos[10];
		
		for(int i = 0; i<n; i++) {
			
			System.out.printf("\nAluguel #%d:",(i+1));
			System.out.print("\nNome: ");
			ler.nextLine();
			String nome = ler.nextLine();
			System.out.print("Email: ");
			String email = ler.next();
			System.out.print("Número do quarto: ");
			int numeroQ = ler.nextInt();
			
			/*Maneira 1:
			 * 
			 * Quartos quarto1 = new Quartos(nome, email);
			 * quarto[numeroQ] = quarto1 
			 * */
			
			//Maneira 2:
			
			quarto[numeroQ] = new Quartos(nome, email);
		
		}
		
		System.out.println("\nQuartos ocupados:");
		System.out.println();
		
		for(int i = 0; i<10; i++) {
			if (quarto[i] != null) {
				System.out.println(i +": " + quarto[i]);
			}
		}
		
		ler.close();
	}

}
