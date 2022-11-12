package Condicionais;

import java.util.Scanner;

public class DuracaoGame {
	
	public static void main(String[] args) {
	
		int inicio;
		int fim;
		int duracao = 0;
		Scanner ler = new Scanner(System.in);
		
		inicio = ler.nextInt();
		fim = ler.nextInt();
	
		
		if(inicio < fim) {
			duracao = fim - inicio;
		}
		else {
			duracao = 24 - inicio + fim;
			
		}
		System.out.println("O jogo durou " + duracao + " horas");
		
		ler.close();
}
}
