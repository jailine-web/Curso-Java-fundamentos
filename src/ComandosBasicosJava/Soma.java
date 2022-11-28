package ComandosBasicosJava;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
		double numero1;
		double numero2;
		double soma = 0;
		
		Scanner ler = new Scanner(System.in);
		
		//System.out.println("Digite um número:");
		numero1 = ler.nextDouble();
		//System.out.println("Digite um número: ");
		numero2 = ler.nextDouble();
		soma = numero1 + numero2;
		System.out.println("Soma = "+ soma);
		
		ler.close();
		
	}
}
